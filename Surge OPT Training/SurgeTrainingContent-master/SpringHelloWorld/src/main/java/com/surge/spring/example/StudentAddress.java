package com.surge.spring.example;

public class StudentAddress {
	 String place;
	 String city;

	public void setPlace(String place) {
	 this.place = place;
	 System.out.println("Sai obj called..............");
	 }

	public void setCity(String city) {
	 this.city = city;
	 System.out.println("Swetha obj called..............");
	 }

	@Override
	 public String toString() {
	 return "StudentAddress [place=" + place + ", city=" + city + "]";
	 }

	}
