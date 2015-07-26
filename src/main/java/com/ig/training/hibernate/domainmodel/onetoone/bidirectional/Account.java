package com.ig.training.hibernate.domainmodel.onetoone.bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="OTO_B_ACCOUNT")
public class Account {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name="balance")
   private double balance;

   // By default, there's no cascade. See the code of @OneToOne
   @OneToOne(cascade = {CascadeType.ALL})
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

   public void setPerson(Person person) {
      this.person = person;
      person.setAccount(this);
   }

   @Override
   public String toString() {
      return "OneToOneAccount{" +
            "id=" + id +
            ", balance=" + balance +
            ", person=" + person +
            '}';
   }
}
