package com.thanthu.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ContructorGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Constructor";
	}

}
