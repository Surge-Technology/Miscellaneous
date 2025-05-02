package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Book book = (Book) context.getBean("book");
		System.out.println(book);
		
		
		Product product = (Product) context.getBean("product");

 		System.out.println("Product Name : " + product.getName());
 		System.out.println("Price : " + product.getPrice());		
		/*HelloWorld helloWorldBean = context.getBean("myBean", HelloWorld.class);
		helloWorldBean.sayHello();*/
	}

}