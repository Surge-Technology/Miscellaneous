package com.surge.spring.constructorexample;

public class StudentAddress {
	String place;
	String city;

	public StudentAddress(String place, String city) {
		System.out.println("StudentAddress Constructor Called");
		this.place = place;
		this.city = city;
	}

	@Override
	public String toString() {
		return "StudentAddress [place=" + place + ", city=" + city + "]";
	}

}