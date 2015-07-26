package com.ig.training.hibernate.domainmodel.jpql;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.Test;

import javax.persistence.Query;
import java.time.LocalDateTime;
import java.util.List;

public class JpqlTest extends AbstractJpaTest {

   @Test
   public void allCustomers() {
      Query query = em().createQuery("from JPQL_CUSTOMER");
      List<Customer> customers = query.getResultList();

      for (Customer customer : customers) {
         System.out.println(customer);
      }
   }

   @Test
   public void customersWhoBoughtTuneFlavouredChocolate() {
      Query query = em().createQuery(
            "select c from JPQL_CUSTOMER c " +
                  "join c.orders o " +
                  "join o.products p " +
                  "where p.name = 'Tuna-flavoured chocolate'");
      List<Customer> customers = query.getResultList();

      System.out.println("The following customers have really bad taste");
      for (Customer customer : customers) {
         System.out.println(customer);
      }
   }

   @Test
   public void customersWhoOrderedProducts1or3() {
      Query query = em().createQuery(
            "select distinct c from JPQL_CUSTOMER c " +
                  "join c.orders o " +
                  "join o.products p " +
                  "where p.id in(1,3))");
      List<Customer> customers = query.getResultList();

      System.out.println("Customers who ordered 1 or 3");
      for (Customer customer : customers) {
         System.out.println(customer);
      }
   }

   @Test
   public void customersWhoOrderedInMarch2015() {
      Query query = em().createQuery(
            "select distinct c from JPQL_CUSTOMER c " +
                  "join c.orders o " +
                  "where o.placedAt between :from and :to");
      query.setParameter("from", LocalDateTime.of(2015, 3, 1, 0, 0));
      query.setParameter("to", LocalDateTime.of(2015, 4, 1, 0, 0));
      List<Customer> customers = query.getResultList();

      System.out.println("Customers who ordered in March 2015");
      for (Customer customer : customers) {
         System.out.println(customer);
      }
   }

   @Test
   public void testNamedQuery() {
      Query query = em().createNamedQuery("namedQ");
      List<Product> products = query.getResultList();

      for (Product product : products) {
         System.out.println(product);
      }
   }
}