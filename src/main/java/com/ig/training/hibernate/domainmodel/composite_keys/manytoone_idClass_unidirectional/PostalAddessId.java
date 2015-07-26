package com.ig.training.hibernate.domainmodel.composite_keys.manytoone_idClass_unidirectional;

import java.io.Serializable;

public class PostalAddessId implements Serializable {
   private Long customerId;
   private String addressType;

   //required by Hibernate
   private PostalAddessId() {
   }

   public PostalAddessId(Long customerId, String addressType) {
      this.customerId = customerId;
      this.addressType = addressType;
   }

   public Long getCustomerId() {
      return customerId;
   }

   public String getAddressType() {
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
