package com.ig.training.hibernate.domainmodel.composite_keys.single_class.embeddable_withEnum;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="COMP_KEY_SING_EMBEDDED_ENUM_SEAT")
public class TheaterSeat {
   @EmbeddedId
   private TheaterSeatPK theaterSeatPK;

   private double price;

   // required by hibernate
   private TheaterSeat() {
   }

   public TheaterSeat(Row row, int number) {
      this.theaterSeatPK = new TheaterSeatPK(row, number);
   }

   public Row getRow() {
      return theaterSeatPK.getRow();
   }

   public int getNumber() {
      return theaterSeatPK.getNumber();
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   @Override
   public String toString() {
      return "TheaterSeat{" +
            "theaterSeatPK='" + theaterSeatPK + '\'' +
            ", price=" + price +
            '}';
   }
}
