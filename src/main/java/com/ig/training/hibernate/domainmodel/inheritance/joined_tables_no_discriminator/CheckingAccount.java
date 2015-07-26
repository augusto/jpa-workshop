package com.ig.training.hibernate.domainmodel.inheritance.joined_tables_no_discriminator;


import javax.persistence.Entity;

@Entity(name = "INHERITANCE_JTND_CHECKING_ACCOUNT")
public class CheckingAccount extends Account {

   private double checkLimitAmount;

   public double getCheckLimitAmount() {
      return checkLimitAmount;
   }

   public void setCheckLimitAmount(double checkLimitAmount) {
      this.checkLimitAmount = checkLimitAmount;
   }

   @Override
   public String toString() {
      return "CheckingAccount{" +
            "checkLimitAmount=" + checkLimitAmount +
            "} " + super.toString();
   }
}
