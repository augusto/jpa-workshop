package com.ig.training.hibernate.domainmodel.composite_keys.foreignKey;

import java.io.Serializable;

public class PostalAddessId implements Serializable {
   private Long customerId;
   private AddressType addressType;

   //required by Hibernate
   private PostalAddessId() {
   }

   public PostalAddessId(Long customerId, AddressType addressType) {
      this.customerId = customerId;
      this.addressType = addressType;
   }

   public Long getCustomerId() {
      return customerId;
   }

   public AddressType getAddressType() {
      return addressType;
   }

   @Override
   public String toString() {
      return "PostalAddessId{" +
            "customerId=" + customerId +
            ", addressType=" + addressType +
            '}';
   }
}
