package com.sb.controller;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside About Handler");
		model.addAttribute("name", "Mayuresh");
		model.addAttribute("currentDate", new Date().toString());
		return "about";
	}
	// Handling iteration

	@GetMapping("/iterate")
	public String iterateHandler(Model model) {
		// create a list , set , collection
		List<String> listOfStudents = List.of("Mass", "Goku", "Vegeta", "gohan");
		model.addAttribute("listOfStudents", listOfStudents);
		return "iterate";
	}

	@GetMapping("/condition")
	public String conditionHandler(Model model) {
		// conditon ? "true" : " false"
		model.addAttribute("isActive", true);

		// th:if and th:unless
		model.addAttribute("gender", "M");

		// switch case
		List<Integer> list = List.of();
		model.addAttribute("myList", list);
		return "condition";
	}

	// fragments are part of thymeleaf tags or html tags
	// for example if we want to make header we can use that header in many pages
	// ie. common header
	
	//handler for including fragment
	@GetMapping("service")
	public String servicesHandler(Model m) {
		//how to pass dynamic data
		m.addAttribute("title","This is title bro");
		m.addAttribute("subTitle", "This is subtitle bro");
		
		return "service";	
	}
	
	
















}
