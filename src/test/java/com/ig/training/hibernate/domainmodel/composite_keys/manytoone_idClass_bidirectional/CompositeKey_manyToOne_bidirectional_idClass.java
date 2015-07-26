package com.ig.training.hibernate.domainmodel.composite_keys.manytoone_idClass_bidirectional;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.assertj.core.api.Assertions.assertThat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompositeKey_manyToOne_bidirectional_idClass extends AbstractJpaTest {

   @Test
   public void _1_persist() {
      Customer customer = new Customer();
      customer.setName("Matt");

      PostalAddress postalAddress = new PostalAddress();
      postalAddress.setAddressType("home");
      postalAddress.setLine1("10 Downing Street");
      postalAddress.setPostCode("SW1A 2AA");

      customer.add(postalAddress);

      em().persist(customer);
   }

   @Test
   public void _2_retrieve(){
      Customer customer = em().find(Customer.class, 1L);

      assertThat(customer).isNotNull();

      System.out.println(customer);
   }
}