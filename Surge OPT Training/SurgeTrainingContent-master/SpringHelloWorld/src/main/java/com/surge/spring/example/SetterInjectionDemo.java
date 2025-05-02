package com.surge.spring.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

//https://www.javagf.com/setter-injection-dependent-object

public class SetterInjectionDemo {
	
	private static BeanFactory beanFactoryObj;
	 
    // This Method Is Used To Load The Spring Bean Configuration File And Return The 'BeanFactory' Object
    public static BeanFactory getBeanFactory() {
        beanFactoryObj = new XmlBeanFactory(new ClassPathResource("spring-beans.xml"));
        return beanFactoryObj;
    }
    
 
 
    // This Is The Main Method And In Here We Are Retrieving The Spring Bean via 'getBean()' Method
    public static void main(String[] args) {

//		StudentAddress studentAddress = (StudentAddress)getBeanFactory().getBean("studentAddress");
//		Student student = (Student)getBeanFactory().getBean("student");
//		System.out.println(student);
//		
		ListInjection studentList = (ListInjection)getBeanFactory().getBean("listInjection");
		System.out.println(studentList);
		List<String> tempList = new ArrayList<String>();
		tempList.add("temp");
		
		studentList.setStudentList(tempList);
		System.out.println(studentList);
		System.out.println(studentList.getMobileNumber());
//		
//		MapInjection mapInjection = (MapInjection)getBeanFactory().getBean("mapInjection");
//		System.out.println(mapInjection);
//		 
//		 MapInjectionClassRef mapInjectionClassRef = (MapInjectionClassRef)getBeanFactory().getBean("mapInjectionClassRef");
//		 System.out.println(mapInjectionClassRef);
		 //PropInjection propInjection = (PropInjection)getBeanFactory().getBean("propInjection");
		 //System.out.println(propInjection);
		 
//		 SingletonBeanDemo singletonBeanDemo1 = (SingletonBeanDemo)getBeanFactory().getBean("SingletonBeanDemo");
//		 SingletonBeanDemo singletonBeanDemo2 = (SingletonBeanDemo)getBeanFactory().getBean("Singleton.BeanDemo");
//		 System.out.println(singletonBeanDemo1.hashCode());
//		 System.out.println(singletonBeanDemo2.hashCode());
    }

	
}