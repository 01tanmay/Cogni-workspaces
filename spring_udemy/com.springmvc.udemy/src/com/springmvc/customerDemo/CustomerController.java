package com.springmvc.customerDemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@InitBinder
	public void InitBinder(WebDataBinder binder) {

		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, ste);

	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		model.addAttribute("customer", new Customer());

		return "customerForm";
	}

	@RequestMapping("/processCustomerForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult bindResult) {

		if (bindResult.hasErrors())
			return "customer-form";
		else
			return "customer-confirmation";
	}

}
