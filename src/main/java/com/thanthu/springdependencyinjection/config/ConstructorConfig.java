package com.thanthu.springdependencyinjection.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConstructorBinding
@ConfigurationProperties("datasource")
public class ConstructorConfig {

	private final String username;
	private final String password;
	private final String url;
	
	public ConstructorConfig(String username, String password, String url) {
		this.username = username;
		this.password = password;
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return "ConstructorConfig [username=" + username + ", password=" + password + ", url=" + url + "]";
	}
	

}
