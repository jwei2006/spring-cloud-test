package com.jw.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//@SpringBootApplication // 等同于下面三个
@EnableAutoConfiguration
@Configuration
@ComponentScan
@ImportResource(locations = {"classpath:prop-spring-boot.xml"})// 配合下面一个import标签，加载应用properties设置
@ImportAutoConfiguration
public class Application{
	public static void main(String[] args){
		SpringApplication.run(Application.class, "--server.port=80");
//		SpringApplication.run(Application.class, args);
	}
}
