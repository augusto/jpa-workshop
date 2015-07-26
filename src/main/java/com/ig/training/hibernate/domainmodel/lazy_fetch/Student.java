package com.ig.training.hibernate.domainmodel.lazy_fetch;

import javax.persistence.*;

@Entity(name="LAZY_STUDENT")
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @OneToOne
   @JoinColumn(name="SEAT_ID")
   private Seat seat;

   @Column(name = "FIRST_NAME")
   @Basic(fetch = FetchType.LAZY)
   private String name;

   public Long getId() {
      return id;
   }

   public Seat getSeat() {
      return seat;
   }

   public void setSeat(Seat seat) {
      this.seat = seat;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Student{" +
            "id=" + id +
            ", seat=" + seat +
            ", name='" + name + '\'' +
            '}';
   }
}

