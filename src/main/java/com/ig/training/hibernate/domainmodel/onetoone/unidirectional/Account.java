package com.ig.training.hibernate.domainmodel.onetoone.unidirectional;

import javax.persistence.*;

@Entity(name="OTO_U_ACCOUNT")
public class Account {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name="balance")
   private double balance;

   // By default, there's no cascade. See the code of @OneToOne
   @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
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
