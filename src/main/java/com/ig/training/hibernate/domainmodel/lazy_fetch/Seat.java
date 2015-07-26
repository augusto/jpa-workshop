package com.ig.training.hibernate.domainmodel.lazy_fetch;

import javax.persistence.*;

@Entity(name="LAZY_SEAT")
public class Seat {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name="number")
   private int number;

   public Long getId() {
      return id;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   @Override
   public String toString() {
      return "Seat{" +
            "id=" + id +
            ", number=" + number +
            '}';
   }
}

