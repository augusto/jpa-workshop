package com.ig.training.hibernate.domainmodel.onetoone.unidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="OTO_U_PERSON")
public class Person {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name = "FIRST_NAME")
   private String name;

   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
   }
}
