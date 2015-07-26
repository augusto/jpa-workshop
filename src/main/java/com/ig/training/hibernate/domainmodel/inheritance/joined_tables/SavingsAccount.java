package com.ig.training.hibernate.domainmodel.inheritance.joined_tables;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "INHERITANCE_JT_SAVINGS_ACCOUNT")
@DiscriminatorValue("SAVINGS")
public class SavingsAccount extends Account  {
   private double atmLimit;

   public double getAtmLimit() {
      return atmLimit;
   }

   public void setAtmLimit(double atmLimit) {
      this.atmLimit = atmLimit;
   }

   @Override
   public String toString() {
      return "SavingsAccount{" +
            "atmLimit=" + atmLimit +
            "} " + super.toString();
   }
}
