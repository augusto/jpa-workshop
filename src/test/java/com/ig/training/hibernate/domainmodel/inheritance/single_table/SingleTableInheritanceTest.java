package com.ig.training.hibernate.domainmodel.inheritance.single_table;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.assertj.core.api.Assertions;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SingleTableInheritanceTest extends AbstractJpaTest {

   @Test
   public void _1_test() {
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

}
