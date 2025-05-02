package com.surge.spring.constructorexample;

import java.util.Map;

public class MapInjection {

	Map<Integer, String> studentMap;
	Map<Integer, String> teacherMap;

	public MapInjection(Map<Integer, String> studentMap, Map<Integer, String> teacherMap) {
		System.out.println("MAP Constructor Called");
		this.studentMap = studentMap;
		this.teacherMap = teacherMap;
	}

}