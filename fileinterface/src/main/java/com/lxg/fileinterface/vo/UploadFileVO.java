package com.lxg.fileinterface.vo;

import java.io.Serializable;

/**
 * Created by xuegangliu on 2017/11/2.
 */
public class UploadFileVO implements Serializable {
    private byte[] fileContent;
    private String contentType;
    private String fileName;
    private String appCode;
    private String bizCode;
    public byte[] getFileContent() {
        return fileContent;
    }
    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }
    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getAppCode() {
        return appCode;
    }
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }
    public String getBizCode() {
        return bizCode;
    }
    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

}