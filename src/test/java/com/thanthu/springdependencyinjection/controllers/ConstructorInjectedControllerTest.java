package com.thanthu.springdependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.thanthu.springdependencyinjection.services.ContructorGreetingServiceImpl;

class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController constructorInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		constructorInjectedController = new ConstructorInjectedController(new ContructorGreetingServiceImpl());
	}

	@Test
	void test() {
		System.out.println(constructorInjectedController.getGreeting());
	}

}
