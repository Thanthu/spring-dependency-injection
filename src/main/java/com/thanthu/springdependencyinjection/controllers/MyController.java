package com.thanthu.springdependencyinjection.controllers;

import org.springframework.stereotype.Controller;

import com.thanthu.springdependencyinjection.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
