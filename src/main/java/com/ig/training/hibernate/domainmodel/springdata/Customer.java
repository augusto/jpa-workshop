package com.ig.training.hibernate.domainmodel.springdata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity(name = "SPRING_DATA_CUSTOMER")
public class Customer {
   @Id @GeneratedValue
   private Long id;

   private String forename;
   private String surname;
   @Column(name = "DOB")
   @Temporal(TemporalType.DATE)
   private Date dateOfBirth;

   public Long getId() {
      return id;
   }

   public String getForename() {
      return forename;
   }

   public void setForename(String forename) {
      this.forename = forename;
   }

   public String getSurname() {
      return surname;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public Date getDateOfBirth() {
      return dateOfBirth;
   }

   public void setDateOfBirth(Date dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }

   @Override
   public String toString() {
      return "Customer{" +
            "id=" + id +
            ", forename='" + forename + '\'' +
            ", surname='" + surname + '\'' +
            ", dateOfBirth=" + dateOfBirth +
            '}';
   }
}
