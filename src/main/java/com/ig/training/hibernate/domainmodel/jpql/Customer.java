package com.ig.training.hibernate.domainmodel.jpql;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity(name="JPQL_CUSTOMER")
public class Customer {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="CUSTOMER_ID")
   private Long id;

   @Column(name="NAME")
   private String name;

   @OneToMany(cascade = CascadeType.ALL)
   @JoinColumn(name="CUSTOMER_ID", nullable = false)
   private Set<Order> orders = new HashSet<>();

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void add(Order order) {
      orders.add(order);
   }

   public Collection<Order> getOrders() {
      return Collections.unmodifiableSet(orders);
   }

   @Override
   public String toString() {
      return "Customer{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", orders=" + orders +
            '}';
   }
}
