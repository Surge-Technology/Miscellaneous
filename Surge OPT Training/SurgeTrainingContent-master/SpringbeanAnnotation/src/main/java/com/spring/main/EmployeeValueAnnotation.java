package com.spring.main;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
//https://www.javagf.com/value-annotation-spring
public class EmployeeValueAnnotation {

	private String id;
	private String name;
	private String company;
	private Map <String, String> studentTeacherMap ;

	
	
	
	
	public Map<String, String> getStudentTeacherMap() {
		return studentTeacherMap;
	}
	
	
	@Value("#{{'1': 'Catch-22', '2': '1984', '3': 'Pride and Prejudice'}}")
	public void setStudentTeacherMap(Map<String, String> studentTeacherMap) {
		this.studentTeacherMap = studentTeacherMap;
	}
	
	
	public EmployeeValueAnnotation() {
		System.out.println("EmployeeValueAnnotation class object created..");
	}
	public String getId() {
		return id;
	}

	@Value("1001")
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Value("Vikashmod")
	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	@Value("spring")
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + "]";
	}

}