package com.goodrain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/ribbon", method = RequestMethod.GET)
	public String add() {
		return restTemplate.getForEntity("http://EUREKA-SERVICE/demo/show", String.class).getBody();
	}
}