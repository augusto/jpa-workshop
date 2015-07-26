package com.ig.training.hibernate.domainmodel.jpql;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity(name="JPQL_ORDER")
public class Order {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="ORDER_ID")
   private Long id;

   @Column(name="PLACED_AT",columnDefinition = "TIMESTAMP(0) NOT NULL")
   private LocalDateTime placedAt;

   @ManyToMany
   @JoinTable(
         name="JPQL_ORDER_PRODUCT",
         joinColumns={@JoinColumn(name="ORDER_ID")},
         inverseJoinColumns={@JoinColumn(name="PRODUCT_ID")}
   )
   private Set<Product> products = new HashSet<>();

   public Order() {
      this.placedAt = LocalDateTime.now();
   }

   public Long getId() {
      return id;
   }

   public LocalDateTime getPlacedAt() {
      return placedAt;
   }

   public void add(Product product) {
      products.add(product);
   }

   public Collection<Product> getProducts() {
      return Collections.unmodifiableSet(products);
   }

   @Override
   public String toString() {
      return "Order{" +
            "id=" + id +
            ", placedAt=" + placedAt +
            ", products=" + products +
            '}';
   }
}
