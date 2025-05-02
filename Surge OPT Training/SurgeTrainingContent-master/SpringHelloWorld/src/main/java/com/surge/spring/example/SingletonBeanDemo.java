package com.surge.spring.example;

public class SingletonBeanDemo {
	int roll;
	String name;

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SingletonBeanDemo(){
		System.out.println("SingletonBeanDemo Constructor Called...");
	}
}