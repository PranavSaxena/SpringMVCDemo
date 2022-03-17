package com.udemy.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create the student object
		Student theStudent = new Student();

		// add student object to model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println(theStudent.getFirstName());
		System.out.println(theStudent.getLastName());
		System.out.println(theStudent.getCountry());
		System.out.println(theStudent.getLanguage());
		System.out.println(theStudent.getOperatingSystems());
		return "student-confirmation";
	}
}
