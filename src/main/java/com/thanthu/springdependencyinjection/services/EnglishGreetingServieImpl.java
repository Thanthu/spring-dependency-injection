package com.thanthu.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("languageService")
public class EnglishGreetingServieImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - EN";
	}

}
