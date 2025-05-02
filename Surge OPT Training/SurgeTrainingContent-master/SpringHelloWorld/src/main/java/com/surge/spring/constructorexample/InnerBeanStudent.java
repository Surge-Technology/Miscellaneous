package com.surge.spring.constructorexample;

public class InnerBeanStudent {
	College college;
	int roll;
	String name;

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "InnerBeanStudent [college=" + college + ", roll=" + roll + ", name=" + name + "]";
	}

}