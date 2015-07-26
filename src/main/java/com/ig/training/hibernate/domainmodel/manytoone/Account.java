package com.ig.training.hibernate.domainmodel.manytoone;

import javax.persistence.*;

@Entity(name = "MANY_TO_ONE_ACCOUNT")
public class Account {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name="balance")
   private double balance;

   @ManyToOne(fetch = FetchType.LAZY)
   private Person person;

   public Long getId() {
      return id;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   public Person getPerson() {
      return person;
   }

   void setPerson(Person person) {
      this.person = person;
   }

   @Override
   public String toString() {
      return "OneToManyAccount{" +
            "id=" + id +
            ", balance=" + balance +
            '}';
   }
}
