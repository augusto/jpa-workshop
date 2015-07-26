package com.ig.training.hibernate.domainmodel.composite_keys.manytoone_idClass_unidirectional;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity(name = "COMP_KEY_O2M_UNI_CUSTOMER")
public class Customer {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "CUSTOMER_ID")
   private Long id;

   private String name;

   @OneToMany //cannot cascade, as we need to set the customerId on the postPersist
   @JoinColumn(name="customer_id")
   private List<PostalAddress> postalAddresses = new ArrayList<PostalAddress>();

   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void add(PostalAddress postalAddress) {
      this.postalAddresses.add(postalAddress);
   }

   @PrePersist
   private void updateCustomerIdOnPostalAddress() {
      for (PostalAddress postalAddress : postalAddresses) {
         if(postalAddress.getCustomerId() == null) {
            postalAddress.setCustomerId(this.getId());
         }
      }
   }

   public Collection<PostalAddress> getPostalAddresses() {
      return Collections.unmodifiableList(postalAddresses);
   }

   @Override
   public String toString() {
      return "Customer{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", postalAddresses=" + postalAddresses +
            '}';
   }
}
