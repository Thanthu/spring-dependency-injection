package com.thanthu.springdependencyinjection.controllers;

import com.thanthu.springdependencyinjection.services.GreetingService;

public class SetterInjectedController {
	
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
