package com.mgb.entities;


public class BackstageAccount {

  private String id;
  private String backstageWorkNum;
  private String backstageName;
  private String backstagePass;
  private String backstageEmail;
  private Long backstageIsSupper;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getBackstageWorkNum() {
    return backstageWorkNum;
  }

  public void setBackstageWorkNum(String backstageWorkNum) {
    this.backstageWorkNum = backstageWorkNum;
  }


  public String getBackstageName() {
    return backstageName;
  }

  public void setBackstageName(String backstageName) {
    this.backstageName = backstageName;
  }


  public String getBackstagePass() {
    return backstagePass;
  }

  public void setBackstagePass(String backstagePass) {
    this.backstagePass = backstagePass;
  }


  public String getBackstageEmail() {
    return backstageEmail;
  }

  public void setBackstageEmail(String backstageEmail) {
    this.backstageEmail = backstageEmail;
  }


  public Long getBackstageIsSupper() {
    return backstageIsSupper;
  }

  public void setBackstageIsSupper(Long backstageIsSupper) {
    this.backstageIsSupper = backstageIsSupper;
  }

}
