package com.thanthu.springdependencyinjection.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.thanthu.springdependencyinjection.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController constructorInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	void test() {
		System.out.println(constructorInjectedController.getGreeting());
	}

}
