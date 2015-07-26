package com.ig.training.hibernate.domainmodel.versioning;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.persistence.LockModeType;
import javax.persistence.Query;

import static org.assertj.core.api.Assertions.assertThat;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VersioningTest extends AbstractJpaTest {

   @Test
   public void _1_persist() {

      Account account = new Account();
      account.setName("Jack");
      account.updateAudit("Tim");

      em().persist(account);
   }

   @Test
   public void _2_update() {
      Query query = em().createQuery("from VERSIONING_ACCOUNT");
      Account account = (Account) query.getSingleResult();

      assertThat(account.getVersion()).isEqualTo(0);


      account.setName("John");
      account.updateAudit("Kim");
      em().persist(account);
   }


   @Test
   public void _3_retrieve() {
      Query query = em().createQuery("from VERSIONING_ACCOUNT");
      Account account = (Account) query.getSingleResult();

      assertThat(account.getVersion()).isEqualTo(1);
   }

   @Test
   public void _4_updateVersionManually() {
      Query query = em().createQuery("from VERSIONING_ACCOUNT");
      Account account = (Account) query.getSingleResult();

      account.setName("Paul");
      account.setVersion(55);

      // JPA doesn't update the version in the DB as it keeps its own copy of it
   }

   @Test
   public void _5_rePopulateObject() {
      //maybe from a web submission form
      Account account = new Account(1L);
      account.setName("Chris");
      account.setVersion(2);

      em().merge(account);
   }


   @Test
   public void _6_increaseVersionArtificially() {
      Query query = em().createQuery("from VERSIONING_ACCOUNT");
      Account account = (Account) query.getSingleResult();

      em().lock(account, LockModeType.OPTIMISTIC_FORCE_INCREMENT);
   }
}