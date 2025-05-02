package com.surge.spring.autowiring;

//https://www.mkyong.com/spring/spring-autowiring-by-type/

public class PersonAutowireByType {
	private AbiltiyAutowireByType abiltiyAutowireByType;

	public void setAbility(AbiltiyAutowireByType abiltiyAutowireByType) {
		this.abiltiyAutowireByType = abiltiyAutowireByType;
	}

	@Override
	public String toString() {
		return "PersonAbiltiyAutowireByType [abiltiyAutowireByType=" + abiltiyAutowireByType + "]";
	}
}
