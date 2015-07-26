package com.ig.training.hibernate.domainmodel.composite_keys.single_class.idclass_withEnum;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="COMP_KEY_SING_IDCLASS_ENUM_SEAT")
@IdClass(TheaterSeatPK.class)
public class TheaterSeat {
   @Id
   private Row row;

   @Id
   private int number;

   private double price;

   // required by hibernate
   private TheaterSeat() {
   }

   public TheaterSeat(Row row, int number) {
      this.row = row;
      this.number = number;
   }

   public Row getRow() {
      return row;
   }

   public int getNumber() {
      return number;
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
            "row=" + row +
            ", number=" + number +
            ", price=" + price +
            '}';
   }
}
