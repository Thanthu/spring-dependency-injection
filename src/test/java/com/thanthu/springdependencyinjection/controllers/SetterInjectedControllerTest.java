package com.thanthu.springdependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.thanthu.springdependencyinjection.services.ContructorGreetingServiceImpl;

class SetterInjectedControllerTest {
	
	SetterInjectedController setterInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new ContructorGreetingServiceImpl());
	}

	@Test
	void test() {
		System.out.println(setterInjectedController.getGreeting());
	}

}
