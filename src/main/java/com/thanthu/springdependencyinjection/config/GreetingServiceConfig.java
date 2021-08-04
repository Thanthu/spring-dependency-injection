package com.thanthu.springdependencyinjection.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.thanthu.springdependencyinjection.datasource.FakeDataSource;

@PropertySource("classpath:datasource.properties")
@Configuration
public class GreetingServiceConfig {

	@Bean
	FakeDataSource fakeDataSource(@Value("${datasource.username}") String username,
			@Value("${datasource.password}") String password, @Value("${datasource.url}") String url) {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(username);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}

}
