package com.udemy.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String language;
	private String[] operatingSystems;

	private LinkedHashMap<String, String> countryList;
	private LinkedHashMap<String, String> languageList;

	public Student() {
		countryList = new LinkedHashMap<String, String>();
		countryList.put("IND", "India");
		countryList.put("PAK", "Pakistan");
		countryList.put("AUS", "Australia");
		countryList.put("BAN", "Bangladesh");
		countryList.put("CAN", "Canada");

		languageList = new LinkedHashMap<String, String>();
		languageList.put("Java", "Java");
		languageList.put("Python", "Python");
		languageList.put("C", "C");
		languageList.put("JavaScript", "JavaScript");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public LinkedHashMap<String, String> getLanguageList() {
		return languageList;
	}

	public void setCountryList(LinkedHashMap<String, String> countryList) {
		this.countryList = countryList;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	

}
