package com.surge.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//https://www.mkyong.com/spring/spring-auto-wiring-beans-in-xml/

public class DemoAutowire {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans-autowire.xml");
		
//		StudentAutowire studentAutowire = (StudentAutowire)ctx.getBean("studentAutowire", StudentAutowire.class);
//		System.out.println(studentAutowire);
		
//		PersonAutowireByType personAutowireByType = (PersonAutowireByType)ctx.getBean("personAutowireByType", PersonAutowireByType.class);
//		System.out.println(personAutowireByType);
		
		DeveloperAutowireConstructor developerAutowireConstructor = (DeveloperAutowireConstructor)ctx.getBean("developerAutowireConstructor", DeveloperAutowireConstructor.class);
		System.out.println(developerAutowireConstructor);


	}

}