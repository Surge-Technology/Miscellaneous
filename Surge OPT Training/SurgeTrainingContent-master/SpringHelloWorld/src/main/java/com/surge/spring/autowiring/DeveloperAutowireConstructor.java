package com.surge.spring.autowiring;

public class DeveloperAutowireConstructor {
	
	private Language language;

	
	public DeveloperAutowireConstructor(Language languagemod) {
		this.language = languagemod;
	}
	
	@Override
	public String toString() {
		return "ConstructorAutowire [language=" + language + "]";
	}

}
