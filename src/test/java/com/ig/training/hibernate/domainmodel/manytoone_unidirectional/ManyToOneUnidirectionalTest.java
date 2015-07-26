package com.ig.training.hibernate.domainmodel.manytoone_unidirectional;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.assertj.core.api.Assertions.assertThat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManyToOneUnidirectionalTest extends AbstractJpaTest {

   @Test
   public void _1_test() {

      Person person = new Person();
      person.setName("Augusto");

      Account account = new Account();
      account.setBalance(200);
      account.setPerson(person);

      em().persist(account);
   }

   @Test
   public void _2_load() {
      Account account = em().find(Account.class, 1l);
      Person person = account.getPerson();

      assertThat(person.getId()).isNotNull();
      assertThat(person.getName()).isEqualTo("Augusto");
   }
}