package com.thanthu.springdependencyinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.thanthu.springdependencyinjection.datasource.FakeDataSource;

@PropertySource("classpath:datasource.properties")
@Configuration
public class GreetingServiceConfig {

	@Bean
	FakeDataSource fakeDataSource(PropertyConfig propertyConfig) {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(propertyConfig.getUsername());
		fakeDataSource.setPassword(propertyConfig.getPassword());
		fakeDataSource.setUrl(propertyConfig.getUrl());
		return fakeDataSource;
	}

}
