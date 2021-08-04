package com.thanthu.springdependencyinjection.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.thanthu.springdependencyinjection.datasource.FakeDataSource;

@EnableConfigurationProperties(ConstructorConfig.class)
@PropertySource("classpath:datasource.properties")
@Configuration
public class GreetingServiceConfig {

	@Bean
	FakeDataSource fakeDataSource(ConstructorConfig constructorConfig) {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(constructorConfig.getUsername());
		fakeDataSource.setPassword(constructorConfig.getPassword());
		fakeDataSource.setUrl(constructorConfig.getUrl());
		return fakeDataSource;
	}

}
