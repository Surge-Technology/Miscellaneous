package com.surge.spring.example;

import java.util.Map;

public class MapInjectionClassRef {

	Map<Integer, Student> studentMap;

	public void setStudentMap(Map<Integer, Student> studentMap) {
		this.studentMap = studentMap;
	}

	@Override
	public String toString() {
		return "MapInjection [studentMap=" + studentMap + "]";
	}

}