package com.mgb.entities;


import java.util.Date;

public class Account {

  private String id;
  private String acUser;
  private String acPass;
  private String acEmail;
  private Long acVip;
  private String acPathName;
  private String acPhone;
  private String acIdentity;
  private Date acReTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getAcUser() {
    return acUser;
  }

  public void setAcUser(String acUser) {
    this.acUser = acUser;
  }


  public String getAcPass() {
    return acPass;
  }

  public void setAcPass(String acPass) {
    this.acPass = acPass;
  }


  public String getAcEmail() {
    return acEmail;
  }

  public void setAcEmail(String acEmail) {
    this.acEmail = acEmail;
  }


  public Long getAcVip() {
    return acVip;
  }

  public void setAcVip(Long acVip) {
    this.acVip = acVip;
  }


  public String getAcPathName() {
    return acPathName;
  }

  public void setAcPathName(String acPathName) {
    this.acPathName = acPathName;
  }


  public String getAcPhone() {
    return acPhone;
  }

  public void setAcPhone(String acPhone) {
    this.acPhone = acPhone;
  }


  public String getAcIdentity() {
    return acIdentity;
  }

  public void setAcIdentity(String acIdentity) {
    this.acIdentity = acIdentity;
  }


  public Date getAcReTime() {
    return acReTime;
  }

  public void setAcReTime(Date acReTime) {
    this.acReTime = acReTime;
  }

}
