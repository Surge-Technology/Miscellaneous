package com.surge.spring.constructorexample;

import java.util.Set;

public class SetInjection {
	Set<String> studentSet;
	Set<String> teacherSet;

	public SetInjection(Set<String> studentSet, Set<String> teacherSet) {
		System.out.println("SET Constructor Called");
		this.studentSet = studentSet;
		this.teacherSet = teacherSet;
	}
}
