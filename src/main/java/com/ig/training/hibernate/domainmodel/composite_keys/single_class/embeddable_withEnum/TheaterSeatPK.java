package com.ig.training.hibernate.domainmodel.composite_keys.single_class.embeddable_withEnum;

import java.io.Serializable;

public class TheaterSeatPK implements Serializable {

   private Row row;
   private int number;

   public TheaterSeatPK() {
   }

   public TheaterSeatPK(Row row, int number) {
      this.row = row;
      this.number = number;
   }

   public Row getRow() {
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
