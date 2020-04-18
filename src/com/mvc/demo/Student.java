package com.mvc.demo;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String computerLanguage;
	private String[] operatingSystems;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> computerLanguageOptions;
	private LinkedHashMap<String, String> operatingSystemOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("IN", "India");
		countryOptions.put("AUS", "Austraila"); 
		countryOptions.put("USA", "United States of America");
		
		computerLanguageOptions = new LinkedHashMap<String, String>();
		computerLanguageOptions.put("Javascript", "Javascript");
		computerLanguageOptions.put("Java", "Java"); 
		computerLanguageOptions.put("PHP", "PHP");
		
		operatingSystemOptions = new LinkedHashMap<String, String>();
		operatingSystemOptions.put("Linux", "Linux");
		operatingSystemOptions.put("Windows", "Windows"); 
		operatingSystemOptions.put("IOS", "IOS");
	}
	
	public LinkedHashMap<String, String> getoperatingSystemOptions() {
		return operatingSystemOptions;
	}

	public void setoperatingSystemOptions(LinkedHashMap<String, String> operatingSystemOptions) {
		this.operatingSystemOptions = operatingSystemOptions;
	}

	public LinkedHashMap<String, String> getComputerLanguageOptions() {
		return computerLanguageOptions;
	}

	public void setComputerLanguageOptions(LinkedHashMap<String, String> computerLanguageOptions) {
		this.computerLanguageOptions = computerLanguageOptions;
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

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getComputerLanguage() {
		return computerLanguage;
	}

	public void setComputerLanguage(String computerLanguage) {
		this.computerLanguage = computerLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
}
