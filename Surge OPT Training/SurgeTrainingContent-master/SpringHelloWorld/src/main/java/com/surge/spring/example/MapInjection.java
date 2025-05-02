package com.surge.spring.example;

import java.util.Map;

public class MapInjection {

	Map<Integer, String> studentMap;

	public void setStudentMap(Map<Integer, String> studentMap) {
		this.studentMap = studentMap;
	}

	@Override
	public String toString() {
		return "MapInjection [map=" + studentMap + "]";
	}

}
