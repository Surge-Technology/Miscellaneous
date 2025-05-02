package com.surge.spring.autowiring;

public class CollegeAutowire {
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
		return "CollegeAutowire [collegeName=" + collegeName + ", collegeAddr=" + collegeAddr + "]";
	}

}