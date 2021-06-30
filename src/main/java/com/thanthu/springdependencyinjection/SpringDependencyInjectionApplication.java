package com.thanthu.springdependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.thanthu.springdependencyinjection.controllers.MyController;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		
		MyController myController = (MyController) applicationContext.getBean("myController");
		System.out.println(myController.getHello());
	}

}
