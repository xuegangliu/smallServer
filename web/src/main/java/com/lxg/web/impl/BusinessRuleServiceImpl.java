package com.lxg.web.impl;

import com.alibaba.fastjson.JSONObject;
import com.lxg.common.bean.RequestObject;
import com.lxg.common.bean.RuleObject;
import com.lxg.common.constant.RuleCode;
import com.lxg.db.domain.EngineRule;
import com.lxg.db.domain.EngineRuleExample;
import com.lxg.db.mapper.BusinessWayMapper;
import com.lxg.db.mapper.EngineRuleMapper;
import com.lxg.web.service.BusinessRuleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

/**
 * @author: xuegangliu
 * @date: 5/28/2018 2:55 PM
 * @DES:
 * @version: v1.0
 */
@Service
public class BusinessRuleServiceImpl implements BusinessRuleService {
    private static final Logger logger = LoggerFactory.getLogger(BusinessRuleServiceImpl.class);

    @Autowired
    private BusinessWayMapper businessWayMapper;
    @Autowired
    private EngineRuleMapper engineRuleMapper;

    @Override
    public RuleObject checkBusinessRule(RequestObject requestObject) {
        RuleObject ruleObject = new RuleObject();

        // 校验的数据json
        JSONObject data = JSONObject.parseObject(requestObject.getData().toString());

        EngineRuleExample engineRuleExample = new EngineRuleExample();
        engineRuleExample.createCriteria().andBusinessCodeEqualTo(data.getString("business_code"));
        List<EngineRule> list = engineRuleMapper.selectByExample(engineRuleExample);
        String err;

        int listSize=list.size();
        if(listSize!=0){
            for(EngineRule t:list){
                String expr = t.getEngineExpression();
                err = exprData(data,t,expr);
                if(err!=null){
                    ruleObject.setCode(false);
                    ruleObject.setData(err);
                    ruleObject.setMessage(RuleCode.NO.getMessage());
                    return ruleObject;
                }
            }
        }else{
            logger.info("此业务无业务规则校验....");
        }
        ruleObject.setCode(true);
        return ruleObject;
    }

    public String exprData(JSONObject data,EngineRule engineRule,String expr){
        String filed = engineRule.getEngineFile();
        String value = engineRule.getEngineValue();
        boolean flag=false;
        if(expr.equals("eq")){ // 等于
            if(data.containsKey(filed)){
                flag = data.get(filed).toString().equals(value)?true:false;
            }
        }else if(expr.equals("!eq")){ //不等于
            if(data.containsKey(filed)){
                flag = data.get(filed).toString().equals(value)?false:true;
            }
        }else if(expr.equals("in")){  // 在
            if(data.containsKey(filed)){
                flag = value.contains(data.get(filed).toString())?true:false;
            }
        }else if(expr.equals("!in")){ // 不在
            if(data.containsKey(filed)){
                flag = value.contains(data.get(filed).toString())?false:true;
            }
        }else if(expr.equals("regr")){ // 正则验证
            if(data.containsKey(filed)){
                flag = Pattern.matches(value, data.get(filed).toString());
            }
        }else if(expr.equals("sql")){ // sql
            flag=true;
        }else{
            flag=true;
        }
        if(!flag)
            return engineRule.getErrInfo();
        return null;
    }
}
