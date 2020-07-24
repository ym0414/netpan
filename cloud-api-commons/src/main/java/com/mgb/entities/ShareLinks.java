package com.mgb.entities;


import java.util.Date;
import java.util.List;

public class ShareLinks {

  private String id;
  private String uid;
  private String code;
  private Date sharetime;
  private Long shareday;
  private Long browsecount;
  private String sharename;




  private List<Files> files;

  public List<Files> getFiles() {
    return files;
  }

  public void setFiles(List<Files> files) {
    this.files = files;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public Date getSharetime() {
    return sharetime;
  }

  public void setSharetime(Date sharetime) {
    this.sharetime = sharetime;
  }


  public Long getShareday() {
    return shareday;
  }

  public void setShareday(Long shareday) {
    this.shareday = shareday;
  }


  public Long getBrowsecount() {
    return browsecount;
  }

  public void setBrowsecount(Long browsecount) {
    this.browsecount = browsecount;
  }


  public String getSharename() {
    return sharename;
  }

  public void setSharename(String sharename) {
    this.sharename = sharename;
  }

}
