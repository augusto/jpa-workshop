package com.ig.training.hibernate.domainmodel.embeddable;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.assertj.core.api.Assertions.assertThat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmbeddableTest extends AbstractJpaTest {

   @Test
   public void _1_test() {
      Address address = new Address();
      address.setPostCode("EC4R 2YA");
      address.setStreet("Dowgate Hill");

      Customer customer = new Customer();
      customer.setAddress(address);

      em().persist(customer);
   }

   @Test
   public void _2_test() {

      Customer customer = em().find(Customer.class, 1l);

      customer.getAddress();
      assertThat(customer).isNotNull();
      assertThat(customer.getAddress().getPostCode()).isEqualTo("EC4R 2YA");
      assertThat(customer.getAddress().getStreet()).isEqualTo("Dowgate Hill");

   }

}
