package com.thanthu.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("languageService")
public class SpanishGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Ola - ES";
	}

}
