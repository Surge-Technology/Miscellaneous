package com.surge.spring.example;

import java.util.Properties;

public class PropInjection {
	Properties propAttribute;

	public void setPropAttribute(Properties propAttribute) {
		this.propAttribute = propAttribute;
	}

	@Override
	public String toString() {
		return "PropInjection [properties=" + propAttribute + "]";
	}

}