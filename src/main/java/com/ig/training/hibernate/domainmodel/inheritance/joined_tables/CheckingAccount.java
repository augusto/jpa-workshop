package com.ig.training.hibernate.domainmodel.inheritance.joined_tables;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "INHERITANCE_JT_CHECKING_ACCOUNT")
@DiscriminatorValue("CHECKING")
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
