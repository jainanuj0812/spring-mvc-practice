package com.mvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "form";
	}
	
	@RequestMapping("/submitForm")
	public String submitForm() {
		return "submitForm";
	}
	
	@RequestMapping("/submitFormVersionTwo")
	public String submitFormVersionTwo(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("name");
		
		name = name.toUpperCase();
		String result = "YO!" + name;
		
		model.addAttribute("message", result);
		return "submitForm";
	}
}
