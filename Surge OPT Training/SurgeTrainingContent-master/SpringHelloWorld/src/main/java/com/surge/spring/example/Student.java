package com.surge.spring.example;

public class Student {
	 StudentAddress studentAddress;
	 int roll;
	 String name;
	 
	public void setStudentAddress(StudentAddress studentAddress) {
	 this.studentAddress = studentAddress;
	 }
	
	public Student(){
		System.out.println("Student obj called..............");
	}

	public void setRoll(int roll) {
		System.out.println("soujanya called");
	 this.roll = roll;
	 }

	public void setName(String name) {
		System.out.println("Lavanya called");
	 this.name = name;
	 }

	@Override
	 public String toString() {
	 return "Student [studentAddress=" + studentAddress + ", roll=" + roll + ", name=" + name + "]";
	 }

	}
