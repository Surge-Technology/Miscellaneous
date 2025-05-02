package com.surge.spring.constructorexample;

import java.util.List;

public class ListInjection {
	List<String> student;

	public ListInjection(List<String> student) {
		
		//super();
		System.out.println("ListInjection Constructor called....");
		
		this.student = student;
	}

}