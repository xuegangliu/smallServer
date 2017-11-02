package com.asiainfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@MapperScan("com.asiainfo.db")
@EntityScan("com.asiainfo.db")
@EnableAutoConfiguration
@SpringBootApplication
public class DbCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbCommonApplication.class, args);
	}
}
