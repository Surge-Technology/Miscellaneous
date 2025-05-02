package com.surge.spring.constructorexample;

public class Student {
	StudentAddress address;
	int roll;
	String name;

	public Student(StudentAddress address, int roll, String name) {
		System.out.println("Constructor Called");
		this.address = address;
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [studentAddress=" + address + ", roll=" + roll + ", name=" + name + "]";
	}

}