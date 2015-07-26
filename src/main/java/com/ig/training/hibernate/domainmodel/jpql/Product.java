package com.ig.training.hibernate.domainmodel.jpql;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name="JPQL_PRODUCT")
@NamedQueries(
      @NamedQuery(name="namedQ", query = "select p from JPQL_PRODUCT p where p not in (select distinct p from JPQL_ORDER o join o.products p)")
)
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="PRODUCT_ID")
   private Long id;

   @Column(name="NAME")
   private String name;

   @Column(name="PRICE")
   private BigDecimal price;

   private Product() {
   }

   public Product(String name, BigDecimal price) {
      this.name = name;
      this.price = price;
   }

   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public BigDecimal getPrice() {
      return price;
   }

   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   @Override
   public String toString() {
      return "Product{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            '}';
   }
}
