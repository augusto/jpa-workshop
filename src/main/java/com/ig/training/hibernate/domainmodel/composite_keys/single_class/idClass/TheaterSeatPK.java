package com.ig.training.hibernate.domainmodel.composite_keys.single_class.idClass;

import java.io.Serializable;

public class TheaterSeatPK implements Serializable {

   private String row;
   private int number;

   public TheaterSeatPK() {
   }

   public TheaterSeatPK(String row, int number) {
      this.row = row;
      this.number = number;
   }

   public String getRow() {
      return row;
   }

   public int getNumber() {
      return number;
   }

   @Override
   public String toString() {
      return "TheaterSeatPK{" +
            "row='" + row + '\'' +
            ", number=" + number +
            '}';
   }
}
