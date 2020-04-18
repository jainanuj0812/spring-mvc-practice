package com.mvc.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrifix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrifix = courseCode.value();
	} 
	
	@Override
	public boolean isValid(String code, ConstraintValidatorContext arg1) {
		boolean result = code != null && code.startsWith(coursePrifix);
		return result;
	}

}
