package com.jw.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication // 等同于下面三个
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Application{
	public static void main(String[] args){
		SpringApplication.run(Application.class, "--server.port=80");
//		SpringApplication.run(Application.class, args);
	}
}
