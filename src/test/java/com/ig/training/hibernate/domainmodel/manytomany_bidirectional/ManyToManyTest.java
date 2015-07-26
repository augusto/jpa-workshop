package com.ig.training.hibernate.domainmodel.manytomany_bidirectional;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.assertj.core.api.Assertions.assertThat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManyToManyTest extends AbstractJpaTest {

   @Test
   public void _1_test() {

      ManyToManyPerson person1 = new ManyToManyPerson();
      person1.setName("Augusto");
      ManyToManyPerson person2 = new ManyToManyPerson();
      person2.setName("Ulysses");

      ManyToManyAccount account1 = new ManyToManyAccount();
      account1.setBalance(100);
      ManyToManyAccount account2 = new ManyToManyAccount();
      account2.setBalance(200);
      ManyToManyAccount account3 = new ManyToManyAccount();
      account3.setBalance(300);

      person1.getAccounts().add(account1);
      person1.getAccounts().add(account2);
      person2.getAccounts().add(account2);
      person2.getAccounts().add(account3);

      em().persist(person1);
      em().persist(person2);
   }

   @Test
   public void _2_load() {
      ManyToManyPerson person1 = em().find(ManyToManyPerson.class, 1L);

      assertThat(person1.getId()).isNotNull();
      assertThat(person1.getName()).isEqualTo("Augusto");
      assertThat(person1.getAccounts()).hasSize(2);

      ManyToManyAccount sharedAccount = null;
      for (ManyToManyAccount account : person1.getAccounts()) {
         if (account.getBalance() == 200.0) {
            sharedAccount = account;
            break;
         }
      }

      assertThat(sharedAccount.getPeople()).hasSize(2);

      System.out.println(sharedAccount);
   }

}