package com.jw.test.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jw.test.service.E1Service;

@Controller
@RequestMapping("")
public class Example1{
	@Autowired
	private E1Service e1Service;
	
	@RequestMapping("/f")
	@ResponseBody
	public String fist() {
		System.out.println(1);
		return "hello";
	}
	
	@RequestMapping("/s")
	@ResponseBody
	public Map<String, String> second(){
		return e1Service.getMap();
	}
}
