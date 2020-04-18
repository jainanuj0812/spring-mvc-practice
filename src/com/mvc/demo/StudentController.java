package com.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showStudentForm(Model model) {
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processStudentForm(@ModelAttribute("student") Student student) {
		System.out.println("Student Name : " + student.getFirstName() + " " + student.getLastName());
		return "student-confirmation";
	}
}
