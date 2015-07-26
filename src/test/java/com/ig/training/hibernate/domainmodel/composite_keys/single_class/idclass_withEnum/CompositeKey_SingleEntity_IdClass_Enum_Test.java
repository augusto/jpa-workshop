package com.ig.training.hibernate.domainmodel.composite_keys.single_class.idclass_withEnum;

import com.ig.training.hibernate.domainmodel.AbstractJpaTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.assertj.core.api.Assertions.assertThat;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompositeKey_SingleEntity_IdClass_Enum_Test extends AbstractJpaTest {

   @Test
   public void _1_persist() {
      TheaterSeat seat = new TheaterSeat(Row.B, 2);
      seat.setPrice(3.1415);
      em().persist(seat);
   }

   @Test
   public void _2_retrieve() {
      TheaterSeat seat = em().find(TheaterSeat.class, new TheaterSeatPK(Row.B, 2));

      assertThat(seat.getPrice()).isEqualTo(3.1415);

      System.out.println(seat);
   }


}