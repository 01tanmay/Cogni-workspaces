package com.ups.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ups.customer.dao.Customers;
import com.ups.customer.service.CustomerService;

@RestController
public class Customer {

	@Autowired
	CustomerService service;

	 @GetMapping("/getdata")
	 public List<Customers> customerDetails() {
		
		 List<Customers> CustDetails = service.test();
		 return CustDetails;
	 }
}
