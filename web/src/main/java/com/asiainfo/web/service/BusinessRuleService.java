package com.asiainfo.web.service;

import com.asiainfo.common.bean.RequestObject;
import com.asiainfo.common.bean.RuleObject;

/**
 * @author: xuegangliu
 * @date: 5/28/2018 2:25 PM
 * @DES:
 * @version: v1.0
 */
public interface BusinessRuleService {

    /**
     * 业务规则校验
     * @param requestObject 请求参数
     * @return 校验结果
     */
    RuleObject checkBusinessRule(RequestObject requestObject);

}
