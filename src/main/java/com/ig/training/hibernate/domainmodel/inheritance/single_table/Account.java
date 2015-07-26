package com.ig.training.hibernate.domainmodel.inheritance.single_table;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name = "INHERITANCE_ST_ACCOUNT")
@Inheritance(
      strategy= InheritanceType.SINGLE_TABLE
)
@DiscriminatorColumn(name="TYPE")
public abstract class Account {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   private double balance;

   public Long getId() {
      return id;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   @Override
   public String toString() {
      return "Account{" +
            "id=" + id +
            ", balance=" + balance +
            '}';
   }
}
