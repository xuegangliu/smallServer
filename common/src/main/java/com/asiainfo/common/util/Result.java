package com.asiainfo.common.util;

import java.io.Serializable;

/**
 * Created by xuegangliu on 2017/11/2.
 */
public class Result implements Serializable{

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

    public Result() {
        this.code = ErrorCode.OK.getCode();
        this.message = ErrorCode.OK.getMessage();
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
