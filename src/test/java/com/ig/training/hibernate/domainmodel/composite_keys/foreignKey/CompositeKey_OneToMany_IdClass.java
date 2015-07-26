package com.ig.training.hibernate.domainmodel.composite_keys.foreignKey;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.Test;

public class CompositeKey_OneToMany_IdClass extends AbstractJpaTest {

   @Test
   public void _1_persist() {
      Customer customer = new Customer();
      customer.setName("Woody");

      PostalAddress postalAddress = new PostalAddress();
      postalAddress.setAddressType(AddressType.HOME);
      postalAddress.setLine1("13 Long St");
      postalAddress.setPostCode("EC4R 2YA");

      customer.add(postalAddress);

      em().persist(customer);
   }

}