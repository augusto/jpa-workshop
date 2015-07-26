package com.ig.training.hibernate.domainmodel.onetoone.bidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="OTO_B_PERSON")
public class Person {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name = "FIRST_NAME")
   private String name;

   @OneToOne(mappedBy = "person")
   private Account account;

   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Account getAccount() {
      return account;
   }

   void setAccount(Account account) {
      this.account = account;
   }

   @Override
   public String toString() {
      return "OneToOnePerson{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
   }
}
