package com.asiainfo.common.constant;

/**
 * @author: xuegangliu
 * @date: 5/28/2018 4:39 PM
 * @DES: 业务规则返回码
 * @version: v1.0
 */
public enum RuleCode {
    YES(true, "符合业务规则"),
    NO(false, "不符合业务规则");

    private boolean code;
    private String message;

    RuleCode(boolean code, String message) {
        this.code = code;
        this.message = message;
    }

    public boolean getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static RuleCode getByCode(final boolean code) {
        final RuleCode[] values = RuleCode.values();
        for (final RuleCode value : values) {
            if (value.getCode() == code)
                return value;
        }
        return null;
    }
}
