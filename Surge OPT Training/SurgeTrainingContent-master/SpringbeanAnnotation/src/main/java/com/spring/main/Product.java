package com.spring.main;


import org.springframework.beans.factory.annotation.Required;

public class Product {
	private Integer price;
	private String name;

	public Integer getPrice() {
		return price;
	}

	@Required
	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}
}