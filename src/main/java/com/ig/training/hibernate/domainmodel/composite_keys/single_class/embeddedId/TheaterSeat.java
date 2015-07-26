package com.ig.training.hibernate.domainmodel.composite_keys.single_class.embeddedId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="COMP_KEY_SING_EMBEDDEDID_SEAT")
public class TheaterSeat {
   @EmbeddedId
   private TheaterSeatPK theaterSeatPK;

   private double price;

   // required by hibernate
   private TheaterSeat() {
   }

   public TheaterSeat(String row, int number) {
      this.theaterSeatPK = new TheaterSeatPK(row,number);
   }

   public String getRow() {
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
