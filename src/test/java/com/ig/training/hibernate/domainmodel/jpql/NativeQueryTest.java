package com.ig.training.hibernate.domainmodel.jpql;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.Test;

import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;

public class NativeQueryTest extends AbstractJpaTest {

   @Test
   public void nativeQuery() {
      Query nativeQuery = em().createNativeQuery("select * from JPQL_PRODUCT");
      List<Object[]> resultList = nativeQuery.getResultList();

      for (Object[] o : resultList) {
         System.out.println(Arrays.toString(o));
      }
   }

   @Test
   public void nativeQueryWhichMapsToAnObject() {
      Query nativeQuery = em().createNativeQuery("select * from JPQL_PRODUCT", Product.class);
      List<Product> resultList = nativeQuery.getResultList();

      for (Product product : resultList) {
         System.out.println(product);
      }
   }
}
