package com.ig.training.hibernate.domainmodel.springdata;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class SpringDataRepositoryTest extends AbstractJpaTest {

   @Autowired
   private CustomerRepository customerRepository;

   @Test
   public void findsAllCustomers() throws Exception {
      List<Customer> customers = customerRepository.findAll();

      assertThat(customers).hasSize(4);
   }

   @Test
   public void findsCustomersByForename() throws Exception {
      List<Customer> customers = customerRepository.findByForename("Carl");

      assertThat(customers).hasSize(2);
   }

   @Test
   public void findsCustomersByForenameAndSurname() throws Exception {
      List<Customer> customers = customerRepository.findByForenameAndSurname("Jack", "Pott");

      assertThat(customers).hasSize(1);
   }

   @Test
   public void findsCustomersByDateOfBirthAfter() throws Exception {
      List<Customer> customers = customerRepository.findByDateOfBirthAfter(new Date(1970 - 1900, 0, 1));

      assertThat(customers).hasSize(2);
   }

   @Test
   public void findsCustomersByForenameStartingWithJ() throws Exception {
      List<Customer> customers = customerRepository.findByNameStartingWithJ();

      assertThat(customers).hasSize(2);
      assertThat(customers.get(0).getForename()).isEqualTo("Jack");
      assertThat(customers.get(1).getForename()).isEqualTo("John");
   }
}