package com.ig.training.hibernate.domainmodel.lazy_fetch;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.persistence.Query;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LazyFetchTest extends AbstractJpaTest {

   @Test
   public void _1_persist() {
      Seat seat = new Seat();
      seat.setNumber(11);
      Student student = new Student();
      student.setName("Paul");
      student.setSeat(seat);

      em().persist(seat);
      em().persist(student);
   }

   @Test
   public void _2_retrieve() {
      Query query = em().createQuery("from LAZY_STUDENT");

      List resultList = query.getResultList();
      System.out.println("Items in list: " + resultList.size());
   }

}