package com.thanthu.springdependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String getHello() {
		System.out.println("Hello world!");
		return "Hi folks!";
	}
	
}
