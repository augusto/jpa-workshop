package com.ig.training.hibernate.domainmodel.manytomany_unidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity(name="M2M_U_PERSON")
public class ManyToManyPerson {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name = "FIRST_NAME")
   private String name;


   @ManyToMany(cascade = {CascadeType.ALL})
   @JoinTable(
         name="M2M_U_PERSON_ACCOUNT",
         joinColumns={@JoinColumn(name="PERSON_ID")},
         inverseJoinColumns={@JoinColumn(name="ACCOUNT_ID")}
   )
   private List<ManyToManyAccount> accounts = new ArrayList<>();


   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<ManyToManyAccount> getAccounts() {
      return accounts;
   }

   public void setAccounts(List<ManyToManyAccount> accounts) {
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
