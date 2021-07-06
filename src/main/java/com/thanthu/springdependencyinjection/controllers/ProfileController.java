package com.thanthu.springdependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.thanthu.springdependencyinjection.services.GreetingService;

@Controller
public class ProfileController {
	
	private final GreetingService greetingService;

	public ProfileController(@Qualifier("languageService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
