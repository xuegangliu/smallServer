package com.asiainfo;

import com.asiainfo.db.domain.FileCenter;
import com.asiainfo.db.domain.FileCenterExample;
import com.asiainfo.db.mapper.FileCenterMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@EnableAutoConfiguration
@MapperScan("com.asiainfo.db.mapper")
@EntityScan("com.asiainfo.db.domain")
@RunWith(SpringRunner.class)
@SpringBootTest
public class DbCommonApplicationTests {

	@Autowired
	FileCenterMapper fileCenterMapper;
	@Test
	public void finAllTest() {
		List<FileCenter> lists =  fileCenterMapper.selectByExample(null);
		System.out.println(lists);
		Assert.assertNotNull(lists);
	}

}
