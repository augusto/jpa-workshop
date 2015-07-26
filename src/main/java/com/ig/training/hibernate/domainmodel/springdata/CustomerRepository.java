package com.ig.training.hibernate.domainmodel.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

   List<Customer> findByForename(String foreName);

   List<Customer> findByForenameAndSurname(String forename, String surname);

   List<Customer> findByDateOfBirthAfter(Date dateOfBirth);

   @Query(value = "FROM SPRING_DATA_CUSTOMER WHERE forename like 'J%' ORDER BY forename")
   List<Customer> findByNameStartingWithJ();
}
