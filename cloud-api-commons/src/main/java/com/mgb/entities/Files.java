package com.mgb.entities;


import java.util.Date;
import java.util.List;

public class Files {

  private String id;
  private String uid;
  private String fileOldName;
  private Long fileSize;
  private String filePath;
  private Long fileType;
  private Date fileDate;
  private Long fileStatue;
  private String fileTransimg;
  private String fileGroup;
  private String fileDiskPath;





  private List<ShareLinks> links;

  public List<ShareLinks> getLinks() {
    return links;
  }

  public void setLinks(List<ShareLinks> links) {
    this.links = links;
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


  public String getFileOldName() {
    return fileOldName;
  }

  public void setFileOldName(String fileOldName) {
    this.fileOldName = fileOldName;
  }


  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }


  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }


  public Long getFileType() {
    return fileType;
  }

  public void setFileType(Long fileType) {
    this.fileType = fileType;
  }


  public Date getFileDate() {
    return fileDate;
  }

  public void setFileDate(Date fileDate) {
    this.fileDate = fileDate;
  }


  public Long getFileStatue() {
    return fileStatue;
  }

  public void setFileStatue(Long fileStatue) {
    this.fileStatue = fileStatue;
  }


  public String getFileTransimg() {
    return fileTransimg;
  }

  public void setFileTransimg(String fileTransimg) {
    this.fileTransimg = fileTransimg;
  }


  public String getFileGroup() {
    return fileGroup;
  }

  public void setFileGroup(String fileGroup) {
    this.fileGroup = fileGroup;
  }


  public String getFileDiskPath() {
    return fileDiskPath;
  }

  public void setFileDiskPath(String fileDiskPath) {
    this.fileDiskPath = fileDiskPath;
  }

}
