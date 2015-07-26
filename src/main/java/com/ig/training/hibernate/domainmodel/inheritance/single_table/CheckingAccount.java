package com.ig.training.hibernate.domainmodel.inheritance.single_table;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
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
