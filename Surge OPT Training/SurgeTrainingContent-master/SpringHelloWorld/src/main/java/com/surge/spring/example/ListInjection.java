package com.surge.spring.example;

import java.util.List;
import java.util.Set;

public class ListInjection {

	List<String> studentList;
	Set<String> mobileNumber;

	public Set<String> getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Set<String> mobileNumber) {
		System.out.println("Via setMobileNumber SETTER");
		this.mobileNumber = mobileNumber;
	}

	public void setStudentList(List<String> studentList) {
		System.out.println("Via SETTER");
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "ListInjection [studentList=" + studentList + "....StudentMobile Set:"+mobileNumber + "]";
	}

}