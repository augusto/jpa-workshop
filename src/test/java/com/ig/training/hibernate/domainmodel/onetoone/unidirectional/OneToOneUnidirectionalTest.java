package com.ig.training.hibernate.domainmodel.onetoone.unidirectional;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OneToOneUnidirectionalTest extends AbstractJpaTest {

   @Test
   public void _1_test() {
      Person person = new Person();
      person.setName("Augusto");

      Account account = new Account();
      account.setBalance(120.20);

      account.setPerson(person);

      em().persist(account);

      assertThat(account.getId()).isNotNull();
      assertThat(account.getPerson().getId()).isNotNull();
   }

   @Test
   public void _2_load() {
      Account account = em().find(Account.class, 1L);

      assertThat(account.getId()).isNotNull();
      assertThat(account.getPerson().getId()).isNotNull();

      assertThat(account.getId()).isNotNull();
      assertThat(account.getPerson().getId()).isNotNull();
      assertThat(account.getPerson().getName()).isEqualTo("Augusto");
      assertThat(account.getBalance()).isEqualTo(120.12, offset(0.1));
   }

}