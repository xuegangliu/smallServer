package com.lxg.db.domain;

import java.util.Date;

public class FileCenter {
    private Long id;

    private String fileId;

    private String fileName;

    private String contentType;

    private String filePath;

    private String fileSize;

    private String fileType;

    private String createUser;

    private Date uploadTime;

    public FileCenter(Long id, String fileId, String fileName, String contentType, String filePath, String fileSize, String fileType, String createUser, Date uploadTime) {
        this.id = id;
        this.fileId = fileId;
        this.fileName = fileName;
        this.contentType = contentType;
        this.filePath = filePath;
        this.fileSize = fileSize;
        this.fileType = fileType;
        this.createUser = createUser;
        this.uploadTime = uploadTime;
    }

    public FileCenter() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType == null ? null : contentType.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize == null ? null : fileSize.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}