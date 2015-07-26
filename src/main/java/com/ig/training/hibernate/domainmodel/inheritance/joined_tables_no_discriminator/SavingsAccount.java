package com.ig.training.hibernate.domainmodel.inheritance.joined_tables_no_discriminator;

import javax.persistence.Entity;

@Entity(name = "INHERITANCE_JTND_SAVINGS_ACCOUNT")
public class SavingsAccount extends Account {
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
