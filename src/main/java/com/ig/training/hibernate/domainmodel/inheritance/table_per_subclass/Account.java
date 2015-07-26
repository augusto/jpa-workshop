package com.ig.training.hibernate.domainmodel.inheritance.table_per_subclass;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name = "INHERITANCE_TPC_ACCOUNT")
@Inheritance(
      strategy= InheritanceType.TABLE_PER_CLASS
)
@DiscriminatorColumn(name="TYPE")
public abstract class Account {
   @Id
   private Long id;

   private double balance;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
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
