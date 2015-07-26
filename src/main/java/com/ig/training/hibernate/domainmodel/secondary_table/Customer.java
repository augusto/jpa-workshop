package com.ig.training.hibernate.domainmodel.secondary_table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;

@Entity(name="SEC_TABLE_CUSTOMER")
@SecondaryTables({
      @SecondaryTable(name="SEC_TABLE_CUSTOMER_ADDRESS", pkJoinColumns={
            @PrimaryKeyJoinColumn(name="customer_id")}
      ),
      @SecondaryTable(name="SEC_TABLE_CUSTOMER_DETAILS", pkJoinColumns={
            @PrimaryKeyJoinColumn(name="customer_id")}
      ),
})
public class Customer {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(table="SEC_TABLE_CUSTOMER_ADDRESS")
   private String street;
   @Column(table="SEC_TABLE_CUSTOMER_ADDRESS")
   private String postCode;
   @Column(table="SEC_TABLE_CUSTOMER_DETAILS")
   private String name;
   @Column(table="SEC_TABLE_CUSTOMER_DETAILS")
   private String email;

   public Long getId() {
      return id;
   }

   public String getStreet() {
      return street;
   }

   public void setStreet(String street) {
      this.street = street;
   }

   public String getPostCode() {
      return postCode;
   }

   public void setPostCode(String postCode) {
      this.postCode = postCode;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public String toString() {
      return "Customer{" +
            "id=" + id +
            ", street='" + street + '\'' +
            ", postCode='" + postCode + '\'' +
            '}';
   }
}
