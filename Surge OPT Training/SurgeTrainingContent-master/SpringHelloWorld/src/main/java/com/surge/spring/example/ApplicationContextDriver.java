package com.surge.spring.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

 
public class ApplicationContextDriver
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
         
        HelloWorld helloObj = (HelloWorld)ctx.getBean("helloBean");
        System.out.println(helloObj.getUsername());
    }
}