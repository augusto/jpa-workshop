package com.ig.training.hibernate.domainmodel.embeddable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="EMBEDDABLE_CUSTOMER")
public class Customer {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Embedded
   private Address address;

   public Long getId() {
      return id;
   }

   public Address getAddress() {
      return address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }

   @Override
   public String toString() {
      return "Customer{" +
            "id=" + id +
            ", address=" + address +
            '}';
   }
}
