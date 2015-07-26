package com.ig.training.hibernate.domainmodel.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OneToManyPerson {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name = "FIRST_NAME")
   private String name;


   @OneToMany(cascade = {CascadeType.ALL})
   @JoinColumn(name="person_id", nullable = false)
   private List<OneToManyAccount> accounts = new ArrayList<>();


   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<OneToManyAccount> getAccounts() {
      return accounts;
   }

   public void setAccounts(List<OneToManyAccount> accounts) {
      this.accounts = accounts;
   }

   @Override
   public String toString() {
      return "OneToOnePerson{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
   }
}
