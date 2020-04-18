package com.mvc.demo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mvc.demo.validation.CourseCode;

public class Customer {
	
	private String FirstName;
	
	@NotNull(message="is Required")
	@Size(min=1, message="is Required")
	private String lastName;
	
	@Min(value=0, message="must be greater than 0")
	@Max(value=10, message="must be less than 10")
	@NotNull(message="is Required")
	private Integer freePass;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digit")
	private String postalCode;
	
	@CourseCode(value="ANUJ", message="should starts with ANUJ")
	private String courseCode;
	
	public Integer getFreePass() {
		return freePass;
	}
	
	

	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}



	public String getCourseCode() {
		return courseCode;
	}



	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
