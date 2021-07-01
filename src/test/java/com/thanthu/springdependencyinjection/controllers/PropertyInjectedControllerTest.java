package com.thanthu.springdependencyinjection.controllers;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.thanthu.springdependencyinjection.services.ContructorGreetingServiceImpl;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController propertyInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		propertyInjectedController = new PropertyInjectedController();
		propertyInjectedController.greetingService = new ContructorGreetingServiceImpl();
	}

	@Test
	void getGreetingTest() {
		System.out.println(propertyInjectedController.getGreeting());
	}

}
