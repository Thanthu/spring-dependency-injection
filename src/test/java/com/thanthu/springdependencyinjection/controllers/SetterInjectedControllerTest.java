package com.thanthu.springdependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.thanthu.springdependencyinjection.services.GreetingServiceImpl;

class SetterInjectedControllerTest {
	
	SetterInjectedController setterInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void test() {
		System.out.println(setterInjectedController.getGreeting());
	}

}
