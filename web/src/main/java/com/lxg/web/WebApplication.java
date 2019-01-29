package com.lxg.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@MapperScan("com.lxg.db")
@EntityScan("com.lxg.db")
@EnableAutoConfiguration
@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run( WebApplication.class, args);
	}
}
