package com.ig.training.hibernate.domainmodel.inheritance.joined_tables_no_discriminator;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.assertj.core.api.Assertions;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.persistence.Query;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JoinedTablesNoDiscriminatorTest extends AbstractJpaTest {

   @Test
   public void _1_persist() {
      CheckingAccount checkingAccount = new CheckingAccount();

      checkingAccount.setBalance(100);
      checkingAccount.setCheckLimitAmount(50);
      em().persist(checkingAccount);

      Assertions.assertThat(checkingAccount.getId()).isNotNull();

      SavingsAccount savingsAccount = new SavingsAccount();
      savingsAccount.setBalance(500);
      savingsAccount.setAtmLimit(25);
      em().persist(savingsAccount);

      Assertions.assertThat(savingsAccount.getId()).isNotNull();
   }

   @Test
   public void _2_load() {
      Query query = em().createQuery("From INHERITANCE_JTND_ACCOUNT");
      List<Account> resultList = query.getResultList();

      System.out.println(resultList);
   }
}