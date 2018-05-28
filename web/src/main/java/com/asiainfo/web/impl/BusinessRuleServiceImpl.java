package com.asiainfo.web.impl;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.common.bean.RequestObject;
import com.asiainfo.common.bean.RuleObject;
import com.asiainfo.db.domain.EngineRule;
import com.asiainfo.db.domain.EngineRuleExample;
import com.asiainfo.db.mapper.BusinessWayMapper;
import com.asiainfo.db.mapper.EngineRuleMapper;
import com.asiainfo.web.service.BusinessRuleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        boolean flag=false;
        if(expr.equals("eq")){
            if(data.containsKey(engineRule.getEngineFile())){
                flag = data.get(engineRule.getEngineFile()).toString().equals(engineRule.getEngineValue())?true:false;
            }
        }else{
            flag=true;
        }
        if(!flag)
            return engineRule.getErrInfo();
        return null;
    }
}
