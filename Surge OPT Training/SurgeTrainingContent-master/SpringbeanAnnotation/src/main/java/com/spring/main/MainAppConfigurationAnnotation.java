package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//https://www.boraji.com/index.php/spring-hello-world-example-with-annotation
public class MainAppConfigurationAnnotation {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		HelloWorld helloWorldBean = context.getBean("myBean", HelloWorld.class);
//		helloWorldBean.sayHello();
//		
		
		
		//StudentLazy studentLazy = context.getBean("studentlazy", StudentLazy.class);
//		
	//	EmployeeValueAnnotation employeeValueAnnotation = context.getBean("employeeValueAnnotation", EmployeeValueAnnotation.class);
//		System.out.println(employeeValueAnnotation.getStudentTeacherMap());
//		System.out.println(employeeValueAnnotation.getCompany());
	}
}