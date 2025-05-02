package com.surge.spring.constructorexample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

//https://www.javagf.com/setter-injection-dependent-object

public class ConstructorInjectionDemo {
	
	private static BeanFactory beanFactoryObj;
	 
    // This Method Is Used To Load The Spring Bean Configuration File And Return The 'BeanFactory' Object
    public static BeanFactory getBeanFactory() {
        beanFactoryObj = new XmlBeanFactory(new ClassPathResource("spring-beans-constructor.xml"));
        return beanFactoryObj;
    }
    
 
 
    // This Is The Main Method And In Here We Are Retrieving The Spring Bean via 'getBean()' Method
    public static void main(String[] args) {

		//StudentAddress studentAddress = (StudentAddress)getBeanFactory().getBean("studentAddress");
//		Student student = (Student)getBeanFactory().getBean("student");
//		System.out.println(student);
//		
//		ListInjection listInjection = (ListInjection)getBeanFactory().getBean("listInjection"); 
//		System.out.println(listInjection.student);		
//		
//		SetInjection setInjection = (SetInjection)getBeanFactory().getBean("setInjection"); 
//		System.out.println(setInjection.studentSet);
//		System.out.println(setInjection.teacherSet);
//		
//		MapInjection mapInjection  = (MapInjection )getBeanFactory().getBean("mapInjection"); 
//		System.out.println(mapInjection.studentMap);
//		System.out.println(mapInjection.teacherMap);
////		
//		Person person= (Person)getBeanFactory().getBean("person");
//        System.out.println(person);
		ParentStudent parentStudent= (ParentStudent)getBeanFactory().getBean("dog");
		System.out.println(parentStudent);
////		
//		InnerBeanStudent innerBeanStudent = (InnerBeanStudent)getBeanFactory().getBean("innerbeanstudent");
//		System.out.println(innerBeanStudent);
//		HelloWorldSingleton helloWorldSingleton = (HelloWorldSingleton)getBeanFactory().getBean("helloWorldSingleton");
//		helloWorldSingleton.setMessage("I am Singleton.............");
//		helloWorldSingleton.getMessage();
//		System.out.println(helloWorldSingleton.hashCode());
//		
//		HelloWorldSingleton helloWorldSingletonDuplicate = (HelloWorldSingleton)getBeanFactory().getBean("helloWorldSingleton");
//		//helloWorldSingletonDuplicate.setMessage("I am not Singleton.............");
//		helloWorldSingletonDuplicate.getMessage();
//		System.out.println(helloWorldSingletonDuplicate.hashCode());
    }

	
}