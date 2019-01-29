package com.lxg.web;

import com.alibaba.fastjson.JSONObject;
import com.lxg.common.bean.RequestObject;
import com.lxg.common.bean.RuleObject;
import com.lxg.web.service.BusinessRuleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@EnableAutoConfiguration
@MapperScan("com.lxg.db.mapper")
@EntityScan("com.lxg.db.domain")
@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTests {

	@Autowired
	private BusinessRuleService businessRuleService;

	@Test
	public void businessRuleServiceTest(){
		RequestObject requestObject = new RequestObject();
		JSONObject data = new JSONObject();
		data.put("business_code","cancel_request2");
		data.put("requestId","3");
		requestObject.setData(data);
		RuleObject ruleObject=businessRuleService.checkBusinessRule(requestObject);
		System.out.println( JSONObject.toJSON(ruleObject));
	}

}
