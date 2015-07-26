package com.ig.training.hibernate.domainmodel;

import com.ig.training.hibernate.HibernateApplication;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {HibernateApplication.class})
@Transactional
@TransactionConfiguration(defaultRollback = false)
public abstract class AbstractJpaTest {

   @Autowired
   private EntityManagerFactory emf;

   @PersistenceContext
   private EntityManager em;

   public EntityManager em() {
      return em;
   }

   public EntityManagerFactory emf() {
      return emf;
   }

   @After
   public void asdas() {

   }

}
