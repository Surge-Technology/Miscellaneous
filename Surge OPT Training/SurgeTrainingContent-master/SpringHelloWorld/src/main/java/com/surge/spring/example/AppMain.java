package com.surge.spring.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
 
public class AppMain {
 
    private static BeanFactory beanFactoryObj;
 
    // This Method Is Used To Load The Spring Bean Configuration File And Return The 'BeanFactory' Object
    public static BeanFactory getBeanFactory() {
        beanFactoryObj = new XmlBeanFactory(new ClassPathResource("spring-beans.xml"));
        return beanFactoryObj;
    }
    
    
 
    // This Is The Main Method And In Here We Are Retrieving The Spring Bean via 'getBean()' Method
    public static void main(String[] args) {
    	
    	BeanFactory tempBeanFactory = getBeanFactory();
    	
    	
    	
        //HelloWorld helloObj = (HelloWorld) getBeanFactory().getBean("helloBean");
    	HelloWorld helloObj = (HelloWorld)tempBeanFactory.getBean("nobin");
        System.out.println(helloObj.getUsername());
        System.out.println(helloObj.getEmpSalary());
    }
}

