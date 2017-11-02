package com.asiainfo.common.util;

/**
 * Created by xuegangliu on 2017/11/2.
 */
public enum ErrorCode {

    OK(200, "success"),
    FAIL(-1, "操作失败"),
    DB_ERROR(412, "数据库错误"),
    BUSINESS_ERROR(400, "业务错误"),
    MESSAGE_TOO_OFTEN(401, "消息太频繁请稍后再试"),
    REPEAT_ERROR(406, "信息重复"),
    NOT_FOUND_ERROR(404, "信息未找到"),
    SERVER_ERROR(500, "服务器内部错误"),
    UNAVAILABLE_ERROR(406,"信息不可用"),
    PARAM_IS_NULL(100001,"参数不能为空"),
    UN_LOGIN(-10,"未登陆"),
    UN_GRAY_LEVEL(-11,"不符合灰度测试用户");

    private int code;
    private String message;

    private ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static ErrorCode getByCode(final int code) {
        final ErrorCode[] values = ErrorCode.values();
        for (final ErrorCode value : values) {
            if (value.getCode() == code)
                return value;
        }
        return null;
    }
}
