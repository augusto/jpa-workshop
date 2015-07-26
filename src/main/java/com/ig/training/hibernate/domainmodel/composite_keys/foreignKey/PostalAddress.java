package com.ig.training.hibernate.domainmodel.composite_keys.foreignKey;

import javax.persistence.*;
import java.io.Serializable;

//@Entity(name="COMP_KEY_O2M_ADDRESS")
@IdClass(PostalAddessId.class)
public class PostalAddress {
   @MapsId
   @Column(name="CUSTOMER_ID")
   private Long customerId;

   @Id
   @Enumerated(EnumType.STRING)
   private AddressType addressType;

   private String line1;
   private String line2;
   private String line3;
   private String postCode;

   public Long getCustomerId() {
      return customerId;
   }

   public AddressType getAddressType() {
      return addressType;
   }

   public void setAddressType(AddressType addressType) {
      this.addressType = addressType;
   }

   public String getLine1() {
      return line1;
   }

   public void setLine1(String line1) {
      this.line1 = line1;
   }

   public String getLine2() {
      return line2;
   }

   public void setLine2(String line2) {
      this.line2 = line2;
   }

   public String getLine3() {
      return line3;
   }

   public void setLine3(String line3) {
      this.line3 = line3;
   }

   public String getPostCode() {
      return postCode;
   }

   public void setPostCode(String postCode) {
      this.postCode = postCode;
   }

   @Override
   public String toString() {
      return "PostalAddress{" +
            "customerId=" + customerId +
            ", addressType=" + addressType +
            ", line1='" + line1 + '\'' +
            ", line2='" + line2 + '\'' +
            ", line3='" + line3 + '\'' +
            ", postCode='" + postCode + '\'' +
            '}';
   }
}
