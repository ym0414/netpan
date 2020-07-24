package com.mgb.entities;


import java.util.Date;

public class OperationHistory {

  private String id;
  private Date hisTime;
  private String hisIp;
  private String hisFrom;
  private String hisFacility;
  private Long hisOperation;
  private String accountId;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Date getHisTime() {
    return hisTime;
  }

  public void setHisTime(Date hisTime) {
    this.hisTime = hisTime;
  }


  public String getHisIp() {
    return hisIp;
  }

  public void setHisIp(String hisIp) {
    this.hisIp = hisIp;
  }


  public String getHisFrom() {
    return hisFrom;
  }

  public void setHisFrom(String hisFrom) {
    this.hisFrom = hisFrom;
  }


  public String getHisFacility() {
    return hisFacility;
  }

  public void setHisFacility(String hisFacility) {
    this.hisFacility = hisFacility;
  }


  public Long getHisOperation() {
    return hisOperation;
  }

  public void setHisOperation(Long hisOperation) {
    this.hisOperation = hisOperation;
  }


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

}
