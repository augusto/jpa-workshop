package com.ig.training.hibernate.domainmodel.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OneToManyAccount {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name="balance")
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
      return "OneToManyAccount{" +
            "id=" + id +
            ", balance=" + balance +
            '}';
   }
}
