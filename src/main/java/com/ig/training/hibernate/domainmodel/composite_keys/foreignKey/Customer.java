package com.ig.training.hibernate.domainmodel.composite_keys.foreignKey;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity(name = "COMP_KEY_O2M_CUSTOMER")
public class Customer {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "CUSTOMER_ID")
   private Long id;

   private String name;

   @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
   @JoinColumn(referencedColumnName = "CUSTOMER_ID", name="CUSTOMER_ID", nullable = false, updatable = false)
   private List<PostalAddress> postalAddress = new ArrayList<PostalAddress>();

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
      this.postalAddress.add(postalAddress);
   }

   @Override
   public String toString() {
      return "Customer{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", postalAddress=" + postalAddress +
            '}';
   }
}
