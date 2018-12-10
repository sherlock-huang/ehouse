package com.esmart.ehouse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsTestController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String test(@RequestParam("request") String request) {
		System.out.println(request);
		String a="ssssssssssssssss:";
		return a+request;
	}
}
