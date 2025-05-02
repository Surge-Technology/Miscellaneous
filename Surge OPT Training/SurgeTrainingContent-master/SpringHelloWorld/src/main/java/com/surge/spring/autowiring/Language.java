package com.surge.spring.autowiring;

public class Language {
	
	private String prefLang;

	public String getPrefLang() {
		return prefLang;
	}

	public void setPrefLang(String prefLang) {
		this.prefLang = prefLang;
	}
	
	@Override
	public String toString() {
		return "ConstructorAutowire [prefLang=" + prefLang + "]";
	}

}
