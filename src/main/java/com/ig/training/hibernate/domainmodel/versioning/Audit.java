package com.ig.training.hibernate.domainmodel.versioning;

import javax.persistence.Embeddable;
import java.util.Date;

@Embeddable
public class Audit {
   private Date updatedAt;
   private String updatedBy;

   public Date getUpdatedAt() {
      return updatedAt;
   }

   public String getUpdatedBy() {
      return updatedBy;
   }

   public void updateAudit(String userName) {
      this.updatedAt = new Date();
      this.updatedBy = userName;
   }

   @Override
   public String toString() {
      return "Audit{" +
            "updatedAt=" + updatedAt +
            ", updatedBy='" + updatedBy + '\'' +
            '}';
   }
}
