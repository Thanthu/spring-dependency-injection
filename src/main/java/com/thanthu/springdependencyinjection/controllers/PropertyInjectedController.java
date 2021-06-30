package com.thanthu.springdependencyinjection.controllers;

import com.thanthu.springdependencyinjection.services.GreetingService;

public class PropertyInjectedController {
	
	public GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
	

}
