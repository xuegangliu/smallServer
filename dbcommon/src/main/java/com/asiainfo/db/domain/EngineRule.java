package com.asiainfo.db.domain;

import java.math.BigDecimal;
import java.util.Date;

public class EngineRule {
    private BigDecimal engineId;

    private String engineName;

    private String engineCode;

    private String engineFile;

    private String engineExpression;

    private String engineValue;

    private String engineDescription;

    private String errInfo;

    private String engineWay;

    private String engineScenario;

    private String businessCode;

    private Date createDate;

    private Date updateDate;

    public EngineRule(BigDecimal engineId, String engineName, String engineCode, String engineFile, String engineExpression, String engineValue, String engineDescription, String errInfo, String engineWay, String engineScenario, String businessCode, Date createDate, Date updateDate) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.engineCode = engineCode;
        this.engineFile = engineFile;
        this.engineExpression = engineExpression;
        this.engineValue = engineValue;
        this.engineDescription = engineDescription;
        this.errInfo = errInfo;
        this.engineWay = engineWay;
        this.engineScenario = engineScenario;
        this.businessCode = businessCode;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public EngineRule() {
        super();
    }

    public BigDecimal getEngineId() {
        return engineId;
    }

    public void setEngineId(BigDecimal engineId) {
        this.engineId = engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName == null ? null : engineName.trim();
    }

    public String getEngineCode() {
        return engineCode;
    }

    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode == null ? null : engineCode.trim();
    }

    public String getEngineFile() {
        return engineFile;
    }

    public void setEngineFile(String engineFile) {
        this.engineFile = engineFile == null ? null : engineFile.trim();
    }

    public String getEngineExpression() {
        return engineExpression;
    }

    public void setEngineExpression(String engineExpression) {
        this.engineExpression = engineExpression == null ? null : engineExpression.trim();
    }

    public String getEngineValue() {
        return engineValue;
    }

    public void setEngineValue(String engineValue) {
        this.engineValue = engineValue == null ? null : engineValue.trim();
    }

    public String getEngineDescription() {
        return engineDescription;
    }

    public void setEngineDescription(String engineDescription) {
        this.engineDescription = engineDescription == null ? null : engineDescription.trim();
    }

    public String getErrInfo() {
        return errInfo;
    }

    public void setErrInfo(String errInfo) {
        this.errInfo = errInfo == null ? null : errInfo.trim();
    }

    public String getEngineWay() {
        return engineWay;
    }

    public void setEngineWay(String engineWay) {
        this.engineWay = engineWay == null ? null : engineWay.trim();
    }

    public String getEngineScenario() {
        return engineScenario;
    }

    public void setEngineScenario(String engineScenario) {
        this.engineScenario = engineScenario == null ? null : engineScenario.trim();
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}