package com.udemy.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class DemoAppController {
	
	// need a controller method to show initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "demoapp-form";
	}
	
	// need a controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "demoapp";
	}
	
	// new controller method to read form data
	@RequestMapping("/processFormTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {
		
		// read request parameter from form
		String data = request.getParameter("studentName");
		
		// operations on the data
		String result = "I love you so much my " + data;
		result = result.toUpperCase();
		
		// add data to model
		model.addAttribute("message", result);
		
		return "demoapp";
	}
	
	@RequestMapping("/processFormThree")
	public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {
		
		// operations on the data
		String result = "I mish you my " + name;
		result = result.toUpperCase();
		
		// add data to model
		model.addAttribute("message", result);
		
		return "demoapp";
	}
	
	
	// add data to model
	
}
