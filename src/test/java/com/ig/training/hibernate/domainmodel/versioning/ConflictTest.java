package com.ig.training.hibernate.domainmodel.versioning;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.Ignore;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ConflictTest extends AbstractJpaTest {

   @Test
   @Ignore
   public void xxx() {
      EntityManager em1 = emf().createEntityManager();
      EntityManager em2 = emf().createEntityManager();
      EntityTransaction tx1 = em1.getTransaction();
      tx1.begin();

      Account account = new Account();
      account.setName("Jack");
      account.updateAudit("Tim");

      em1.persist(account);
      tx1.commit();


      tx1.begin();
      Account account1 = em1.find(Account.class, 1L);
      account1.setName("Peter");

      EntityTransaction tx2 = em2.getTransaction();
      tx2.begin();
      Account account2 = em2.find(Account.class, 1L);
      account2.setName("Clark");
      tx2.commit();
      em2.close();

      tx1.commit();
      em1.close();

   }
}
