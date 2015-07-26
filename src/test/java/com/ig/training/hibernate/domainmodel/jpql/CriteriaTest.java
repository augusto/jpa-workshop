package com.ig.training.hibernate.domainmodel.jpql;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.Test;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;

public class CriteriaTest extends AbstractJpaTest {

   @Test
   public void allCustomers() {
      CriteriaBuilder cb = em().getCriteriaBuilder();
      CriteriaQuery<Customer> q = cb.createQuery(Customer.class);
      q.from(Customer.class);

      TypedQuery<Customer> query = em().createQuery(q);

      List<Customer> customers = query.getResultList();

      for (Customer customer : customers) {
         System.out.println(customer);
      }
   }

   @Test
   public void allCustomersWithBadTaste() {
      CriteriaBuilder cb = em().getCriteriaBuilder();
      CriteriaQuery<Customer> q = cb.createQuery(Customer.class);
      Root<Customer> root = q.from(Customer.class);
      Join<Customer, Order> ordersJoin = root.join("orders");
      Join<Order, Product> productsJoin = ordersJoin.join("products");
      Predicate productNameCondition = cb.equal(productsJoin.get("name"), "Tuna-flavoured chocolate");

      q.where(productNameCondition);

      TypedQuery<Customer> query = em().createQuery(q);

      List<Customer> customers = query.getResultList();

      System.out.println("The following customers have really bad taste");
      for (Customer customer : customers) {
         System.out.println(customer);
      }
   }

   @Test
   public void selectAllOrderedProducts() {
      CriteriaBuilder cb = em().getCriteriaBuilder();
      CriteriaQuery<Product> q = cb.createQuery(Product.class);
      Root<Order> root = q.from(Order.class);
      Join<Order, Product> ordersJoin = root.join("products");
      q.select(ordersJoin);
      q.distinct(true);

      TypedQuery<Product> query = em().createQuery(q);

      List<Product> products = query.getResultList();

      for (Product product : products) {
         System.out.println(product);
      }
   }

}
