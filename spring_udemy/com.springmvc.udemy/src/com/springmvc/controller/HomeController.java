package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String demoPage() {
		return "main-menu";
	}

	@RequestMapping("/myForm")
	public String showForm() {
		return "my-form";
	}

	/*
	 * @RequestMapping("/processForm") public String processForm(HttpServletRequest
	 * request, Model model) {
	 * 
	 * String name = request.getParameter("studentName");
	 * 
	 * name = name.toUpperCase();
	 * 
	 * String result = "Yo! " + name;
	 * 
	 * model.addAttribute("message", result);
	 * 
	 * return "processForm"; }
	 */

	@RequestMapping("/processForm")
	public String processFormNew(@RequestParam("studentName") String name, Model model) {

		name = name.toUpperCase();
		String result = "Hey !! " + name;
		model.addAttribute("message", result);
		
		return "processForm";
	}

}
