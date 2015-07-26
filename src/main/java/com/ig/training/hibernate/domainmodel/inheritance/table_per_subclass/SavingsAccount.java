package com.ig.training.hibernate.domainmodel.inheritance.table_per_subclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "INHERITANCE_TPC_SAVINGS_ACCOUNT")
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
