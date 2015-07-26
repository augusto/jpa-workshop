package com.ig.training.hibernate.domainmodel.versioning;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name = "VERSIONING_ACCOUNT")
public class Account {
   @Id @GeneratedValue
   private Long id;

   private String name;

   @Embedded
   @AttributeOverrides({
         @AttributeOverride(name = "updatedBy",column = @Column(name="UPDATED_BY")),
         @AttributeOverride(name = "updatedAt",column = @Column(name="UPDATED_AT"))
   })
   private Audit audit;

   @Version
   public int version;

   public Account() {
   }

   public Account(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void updateAudit(String userName) {
      if( audit == null) {
         audit = new Audit();
      }
      audit.updateAudit(userName);
   }

   int getVersion() {
      return version;
   }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
   public String toString() {
      return "Account{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", audit=" + audit +
            ", version=" + version +
            '}';
   }

   public void setName(String name) {
      this.name = name;
   }
}
