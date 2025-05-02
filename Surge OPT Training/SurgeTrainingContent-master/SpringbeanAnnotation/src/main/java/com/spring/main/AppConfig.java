package com.spring.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/*
 * @Configuration Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions
 * */
@Configuration
public class AppConfig {
	@Bean(name = "nazbean")
	public HelloWorld getHelloWorld() {
		return new HelloWorld();
	}

	@Bean(name = "studentlazy")
	//@Lazy(value = true)
	public StudentLazy getStudentLazy() {
		return new StudentLazy();
	}

	@Bean(name = "employeeValueAnnotation")
	@Lazy(value = true)
	public EmployeeValueAnnotation getEmployeeValueAnnotation() {
		return new EmployeeValueAnnotation();
	}
}
