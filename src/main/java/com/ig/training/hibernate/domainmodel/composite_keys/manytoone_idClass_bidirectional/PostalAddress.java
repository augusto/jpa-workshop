package com.ig.training.hibernate.domainmodel.composite_keys.manytoone_idClass_bidirectional;

import javax.persistence.*;

@Entity(name="COMP_KEY_O2M_BI_ADDRESS")
@IdClass(PostalAddessId.class)
public class PostalAddress {
   @Id
   @ManyToOne
   @JoinColumn(name="CUSTOMER_ID")
   private Customer customer;
   @Id
   @Column(name="ADDRESS_TYPE")
   private String addressType;

   private String line1;
   private String line2;
   private String line3;
   private String postCode;

   public Customer getCustomer() {
      return customer;
   }

   public String getAddressType() {
      return addressType;
   }

   public void setAddressType(String addressType) {
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
            ", addressType=" + addressType +
            ", line1='" + line1 + '\'' +
            ", line2='" + line2 + '\'' +
            ", line3='" + line3 + '\'' +
            ", postCode='" + postCode + '\'' +
            '}';
   }

   void setCustomer(Customer customer) {
      this.customer = customer;
   }
}
