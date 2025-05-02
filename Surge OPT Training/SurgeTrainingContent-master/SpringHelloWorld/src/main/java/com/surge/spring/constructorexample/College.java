package com.surge.spring.constructorexample;

public class College {
	String collegeName;
	String collegeAddr;

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void setCollegeAddr(String collegeAddr) {
		this.collegeAddr = collegeAddr;
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeAddr=" + collegeAddr + "]";
	}

}