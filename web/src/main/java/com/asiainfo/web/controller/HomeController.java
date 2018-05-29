package com.asiainfo.web.controller;

import com.alibaba.fastjson.JSON;
import com.asiainfo.common.bean.RequestObject;
import com.asiainfo.common.bean.RuleObject;
import com.asiainfo.web.service.BusinessRuleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xuegangliu
 * @date: 5/24/2018 8:10 PM
 * @DES:
 * @version: v1.0
 */
@RestController
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private BusinessRuleService businessRuleService;

    @RequestMapping(name = "/index",method = RequestMethod.GET)
    public String home(){
        return "hello";
    }

    @RequestMapping(name = "/ruleTest",method = RequestMethod.POST)
    public String ruleTest(RequestObject requestObject){
        logger.info("规则测试 传入参数"+ JSON.toJSON(requestObject));
        RuleObject ruleObject = businessRuleService.checkBusinessRule(requestObject);

        if(ruleObject.getCode()){
            // 业务处理
            logger.info("符合业务规则");
        }else{
            logger.info("不符合业务规则");
        }
        return JSON.toJSONString(ruleObject);
    }
}
