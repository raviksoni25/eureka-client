package com.sample.microservice.discovery.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consumer {
	
	@RequestMapping("/")
	public String getHome(){
		return "Home Page";
	}

}
