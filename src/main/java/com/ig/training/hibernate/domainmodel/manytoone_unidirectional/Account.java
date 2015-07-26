package com.ig.training.hibernate.domainmodel.manytoone_unidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "M2O_U_ACCOUNT")
public class Account {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name="balance")
   private double balance;

   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name="PERSON_ID")
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
      return "Account{" +
            "id=" + id +
            ", balance=" + balance +
            ", person=" + person +
            '}';
   }
}
