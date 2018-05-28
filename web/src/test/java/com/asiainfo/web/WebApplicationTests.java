package com.asiainfo.web;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.common.bean.RequestObject;
import com.asiainfo.common.bean.RuleObject;
import com.asiainfo.web.service.BusinessRuleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@EnableAutoConfiguration
@MapperScan("com.asiainfo.db.mapper")
@EntityScan("com.asiainfo.db.domain")
@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTests {

	@Autowired
	private BusinessRuleService businessRuleService;

	@Test
	public void businessRuleServiceTest(){
		RequestObject requestObject = new RequestObject();
		JSONObject data = new JSONObject();
		data.put("business_code","cancel_request1");
		data.put("requestId","1");
		requestObject.setData(data);
		RuleObject ruleObject=businessRuleService.checkBusinessRule(requestObject);
		System.out.println( JSONObject.toJSON(ruleObject));
	}

}
