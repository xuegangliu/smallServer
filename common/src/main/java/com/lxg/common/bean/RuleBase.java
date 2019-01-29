package com.lxg.common.bean;

import com.lxg.common.constant.RuleCode;

import java.io.Serializable;

/**
 * @author: xuegangliu
 * @date: 5/28/2018 4:43 PM
 * @DES: 规则返回码信息
 * @version: v1.0
 */
public class RuleBase implements Serializable {

    public boolean code;
    public String message;

    public boolean getCode() {
        return code;
    }

    public void setCode(boolean code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RuleBase() {
        this.code = RuleCode.YES.getCode();
        this.message = RuleCode.YES.getMessage();
    }

    public RuleBase(boolean code, String message) {
        this.code = code;
        this.message = message;
    }

}