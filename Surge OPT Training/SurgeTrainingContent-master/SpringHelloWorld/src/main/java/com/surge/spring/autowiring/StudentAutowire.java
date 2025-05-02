package com.surge.spring.autowiring;

//https://www.mkyong.com/spring/spring-autowiring-by-name/

public class StudentAutowire {
	
	CollegeAutowire collegeAutowire;
	

	

	public void setCollegeAutowire(CollegeAutowire collegeAutowire) {
		this.collegeAutowire = collegeAutowire;
	}



	@Override
	public String toString() {
		return "StudentAutowire [college=" + collegeAutowire + "]";
	}

}