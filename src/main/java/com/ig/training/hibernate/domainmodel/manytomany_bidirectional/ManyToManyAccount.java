package com.ig.training.hibernate.domainmodel.manytomany_bidirectional;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "M2M_B_ACCOUNT")
public class ManyToManyAccount {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name="balance")
   private double balance;

   @ManyToMany(mappedBy = "accounts")
   private List<ManyToManyPerson> people = new ArrayList<>();

   public Long getId() {
      return id;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   public List<ManyToManyPerson> getPeople() {
      return people;
   }

   public void setPeople(List<ManyToManyPerson> people) {
      this.people = people;
   }

   @Override
   public String toString() {
      return "ManyToManyAccount{" +
            "id=" + id +
            ", balance=" + balance +
            ", people=" + people +
            '}';
   }
}
