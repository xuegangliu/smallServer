package com.asiainfo.common.bean;

import com.asiainfo.common.constant.ErrorCode;

import java.io.Serializable;

/**
 * Created by xuegangliu on 2017/11/2.
 */
public class ResultBase implements Serializable{

    public int code;
    public String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBase() {
        this.code = ErrorCode.OK.getCode();
        this.message = ErrorCode.OK.getMessage();
    }

    public ResultBase(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
