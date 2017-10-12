package com.jw.test.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class E1Service{
	public Map<String, String> getMap(){
		Map<String, String> result = new HashMap<>();
		result.put("k1", "v1");
		result.put("k2", "v2");
		return result;
	}
}
