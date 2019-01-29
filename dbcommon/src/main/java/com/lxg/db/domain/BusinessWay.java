package com.lxg.db.domain;

import java.math.BigDecimal;
import java.util.Date;

public class BusinessWay {
    private BigDecimal businessId;

    private String businessName;

    private String businessCode;

    private Date createDate;

    private Date updateDate;

    private String businessDescription;

    public BusinessWay(BigDecimal businessId, String businessName, String businessCode, Date createDate, Date updateDate, String businessDescription) {
        this.businessId = businessId;
        this.businessName = businessName;
        this.businessCode = businessCode;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.businessDescription = businessDescription;
    }

    public BusinessWay() {
        super();
    }

    public BigDecimal getBusinessId() {
        return businessId;
    }

    public void setBusinessId(BigDecimal businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
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

    public String getBusinessDescription() {
        return businessDescription;
    }

    public void setBusinessDescription(String businessDescription) {
        this.businessDescription = businessDescription == null ? null : businessDescription.trim();
    }
}