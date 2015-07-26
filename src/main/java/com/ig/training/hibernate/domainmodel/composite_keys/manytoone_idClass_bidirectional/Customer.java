package com.ig.training.hibernate.domainmodel.composite_keys.manytoone_idClass_bidirectional;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity(name = "COMP_KEY_O2M_BI_CUSTOMER")
public class Customer {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "CUSTOMER_ID")
   private Long id;

   private String name;

   @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
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
      postalAddress.setCustomer(this);
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
