package com.ig.training.hibernate.domainmodel.composite_keys.manytoone_idClass_bidirectional;

import java.io.Serializable;

public class PostalAddessId implements Serializable {
   private Long customer;
   private String addressType;

   //required by Hibernate
   private PostalAddessId() {
   }

   public PostalAddessId(Long customer, String addressType) {
      this.customer = customer;
      this.addressType = addressType;
   }

   public Long getCustomer() {
      return customer;
   }

   public String getAddressType() {
      return addressType;
   }

   @Override
   public String toString() {
      return "PostalAddessId{" +
            "customer=" + customer +
            ", addressType=" + addressType +
            '}';
   }
}
