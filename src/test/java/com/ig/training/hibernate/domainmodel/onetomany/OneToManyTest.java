package com.ig.training.hibernate.domainmodel.onetomany;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.assertj.core.api.Assertions.assertThat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OneToManyTest extends AbstractJpaTest {

   @Test
   public void _1_test() {

      OneToManyPerson person = new OneToManyPerson();
      person.setName("Augusto");

      OneToManyAccount account1 = new OneToManyAccount();
      account1.setBalance(100);
      OneToManyAccount account2 = new OneToManyAccount();
      account2.setBalance(200);

      person.getAccounts().add(account1);
      person.getAccounts().add(account2);

      em().persist(person);
   }

   @Test
   public void _2_load() {
      OneToManyPerson person = em().find(OneToManyPerson.class, 1L);

      assertThat(person.getId()).isNotNull();
      assertThat(person.getName()).isEqualTo("Augusto");
      assertThat(person.getAccounts()).hasSize(2);

      for (int i = 0; i < 2; i++) {
         assertThat(person.getAccounts()).isNotNull();
         assertThat(person.getAccounts().get(i).getBalance()).isEqualTo((i + 1) * 100);
      }
   }
}