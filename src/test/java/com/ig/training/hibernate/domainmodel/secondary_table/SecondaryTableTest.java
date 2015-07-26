package com.ig.training.hibernate.domainmodel.secondary_table;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.assertj.core.api.Assertions.assertThat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SecondaryTableTest extends AbstractJpaTest {

   @Test
   public void _1_test() {
      Customer customer = new Customer();
      customer.setName("John");
      customer.setEmail("John.Doe@ig.com");
      customer.setStreet("Dowgate Hill");
      customer.setPostCode("EC4R 2YA");

      em().persist(customer);
   }

   @Test
   public void _2_test() {

      Customer customer = em().find(Customer.class, 1l);

      assertThat(customer).isNotNull();
      assertThat(customer.getName()).isEqualTo("John");
      assertThat(customer.getEmail()).isEqualTo("John.Doe@ig.com");
      assertThat(customer.getStreet()).isEqualTo("Dowgate Hill");
      assertThat(customer.getPostCode()).isEqualTo("EC4R 2YA");
   }


}