package com.surge.spring.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SpringUtil {

	
	private static BeanFactory beanFactoryObj;
	 
    // This Method Is Used To Load The Spring Bean Configuration File And Return The 'BeanFactory' Object
    public static BeanFactory getBeanFactory() {
        beanFactoryObj = new XmlBeanFactory(new ClassPathResource("spring-beans.xml"));
        return beanFactoryObj;
    }
    
    public static BeanFactory getBeanFactory(String configFileName) {
        beanFactoryObj = new XmlBeanFactory(new ClassPathResource(configFileName));
        return beanFactoryObj;
    }
}
