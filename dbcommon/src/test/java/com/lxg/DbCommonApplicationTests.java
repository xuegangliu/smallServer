//package com.lxg;
//
//import com.alibaba.fastjson.JSONObject;
//import BusinessWay;
//import EngineRule;
//import FileCenter;
//import BusinessWayMapper;
//import EngineRuleMapper;
////import com.lxg.db.mapper.FileCenterMapper;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//import java.util.Date;
//import java.util.List;
//
//@EnableAutoConfiguration
//@MapperScan("com.lxg.db.mapper")
//@EntityScan("com.lxg.db.domain")
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes =DbCommonApplicationTests.class )
//public class DbCommonApplicationTests {
//
////	@Autowired
////	FileCenterMapper fileCenterMapper;
//	@Autowired
//    BusinessWayMapper businessWayMapper;
//	@Autowired
//    EngineRuleMapper engineRuleMapper;
//
////	@Test
////	public void finAllTest() {
////		List<FileCenter> lists =  fileCenterMapper.selectByExample(null);
////		System.out.println(lists);
////		Assert.assertNotNull(lists);
////	}
//
//	@Test
//	public void insertBusinessWayInit(){
//		for(int i=1;i<=50;i++) {
//            BusinessWay businessWay = new BusinessWay();
//            businessWay.setBusinessId( new BigDecimal(i) );
//            businessWay.setBusinessCode( "cancel_request"+i );
//            businessWay.setBusinessName( "订单取消" +i);
//            businessWay.setCreateDate( new Date() );
//            businessWay.setUpdateDate( new Date() );
//            businessWay.setBusinessDescription( "描述"+i );
//            businessWayMapper.insert( businessWay );
//        }
//	}
//
//	@Test
//	public void insertEngineRuleInit(){
//
//		for(int i=1;i<=50;i++) {
//            EngineRule engineRule = new EngineRule();
//            engineRule.setEngineId( new BigDecimal( i) );
//            engineRule.setBusinessCode( "cancel_request"+i );
//            engineRule.setCreateDate( new Date() );
//            engineRule.setEngineCode( "engine_"+i );
//            engineRule.setEngineFile("requestId");
//            engineRule.setEngineExpression( "eq" );
//            engineRule.setEngineValue(i+"");
//            engineRule.setEngineName( "规则"+i );
//            engineRule.setEngineScenario( "scenario_"+i );
//            engineRule.setEngineWay( "way_" +i);
//            engineRule.setUpdateDate( new Date() );
//            engineRule.setEngineDescription("描述"+i);
//            engineRule.setErrInfo("规则"+i+"错误!!");
//            engineRuleMapper.insert( engineRule );
//        }
//	}
//
//
//
//}
