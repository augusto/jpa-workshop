package com.ig.training.hibernate.domainmodel.singletable;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.assertj.core.api.Assertions.assertThat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SingleTableTest extends AbstractJpaTest {

   @Test
   public void _1_test() {
      SingleTablePerson singleTablePerson = new SingleTablePerson();
      singleTablePerson.setFirstName("Augusto");
      singleTablePerson.setLastName("Rodriguez");

      em().persist(singleTablePerson);

      assertThat(singleTablePerson).isNotNull();
      assertThat(singleTablePerson.getFirstName()).isEqualTo("Augusto");
      assertThat(singleTablePerson.getLastName()).isEqualTo("Rodriguez");
   }

   @Test
   public void _2_load() {
      SingleTablePerson singleTablePerson = em().find(SingleTablePerson.class, 1L);

      assertThat(singleTablePerson).isNotNull();
      assertThat(singleTablePerson.getFirstName()).isEqualTo("Augusto");
      assertThat(singleTablePerson.getLastName()).isEqualTo("Rodriguez");
   }

}