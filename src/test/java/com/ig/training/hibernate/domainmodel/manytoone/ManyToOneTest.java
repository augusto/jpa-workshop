package com.ig.training.hibernate.domainmodel.manytoone;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.assertj.core.api.Assertions.assertThat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManyToOneTest extends AbstractJpaTest {

   @Test
   public void _1_test() {

      Person person = new Person();
      person.setName("Augusto");

      Account account1 = new Account();
      account1.setBalance(100);
      Account account2 = new Account();
      account2.setBalance(200);

      person.addAccount(account1);
      person.addAccount(account2);

      em().persist(person);
   }

   @Test
   public void _2_load() {
      Account account = em().find(Account.class, 1l);
      Person person = account.getPerson();

      assertThat(person.getId()).isNotNull();
      assertThat(person.getName()).isEqualTo("Augusto");
      assertThat(person.getAccounts()).hasSize(2);

      for (int i = 0; i < 2; i++) {
         assertThat(person.getAccounts()).isNotNull();
         assertThat(person.getAccounts().get(i).getBalance()).isEqualTo((i + 1) * 100);
      }
   }
}