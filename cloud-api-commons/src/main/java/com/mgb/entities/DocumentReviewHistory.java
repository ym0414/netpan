package com.mgb.entities;


import java.util.Date;

public class DocumentReviewHistory {

  private String id;
  private String auditUserNum;
  private String auditFileNum;
  private Date auditDate;
  private Long auditFileStatus;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getAuditUserNum() {
    return auditUserNum;
  }

  public void setAuditUserNum(String auditUserNum) {
    this.auditUserNum = auditUserNum;
  }


  public String getAuditFileNum() {
    return auditFileNum;
  }

  public void setAuditFileNum(String auditFileNum) {
    this.auditFileNum = auditFileNum;
  }


  public Date getAuditDate() {
    return auditDate;
  }

  public void setAuditDate(Date auditDate) {
    this.auditDate = auditDate;
  }


  public Long getAuditFileStatus() {
    return auditFileStatus;
  }

  public void setAuditFileStatus(Long auditFileStatus) {
    this.auditFileStatus = auditFileStatus;
  }

}
