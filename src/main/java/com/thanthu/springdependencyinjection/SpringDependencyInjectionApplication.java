package com.thanthu.springdependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.thanthu.springdependencyinjection.controllers.ConstructorInjectedController;
import com.thanthu.springdependencyinjection.controllers.MyController;
import com.thanthu.springdependencyinjection.controllers.PropertyInjectedController;
import com.thanthu.springdependencyinjection.controllers.SetterInjectedController;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		
		MyController myController = (MyController) applicationContext.getBean("myController");
		System.out.println(myController.getHello());
		
		System.out.println("------property------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("------setter------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("------controller------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
