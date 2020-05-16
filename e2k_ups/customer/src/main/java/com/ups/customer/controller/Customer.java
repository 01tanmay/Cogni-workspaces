package com.ups.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ups.customer.dao.Customers;
import com.ups.customer.service.CustomerService;

@RestController
@CrossOrigin(origins = "*")
public class Customer {

	@Autowired
	CustomerService service;
	Customers c = new Customers();

	
	 @GetMapping("/customer")
	 public List<Customers> customerAccountNumber(@RequestParam(value = "Accno", defaultValue="") String accno) {
		 List<Customers> CustDetails = service.test(accno);
		 return CustDetails;
	 }
	
	 @GetMapping("/customer")
	 public List<Customers> customerDetails(){
		 String accno = c.getAccountNo();
		 List<Customers> CustDetails = service.test(accno);
		 return CustDetails;
	 }
//	 
//	 @PostMapping(path = "/insert",
//			 consumes = {MediaType.APPLICATION_JSON_VALUE},
//			 produces= {MediaType.APPLICATION_JSON_VALUE}
//			 )
//	 public ResponseEntity<ContactDetails> InsertCustomerDetails(@RequestBody ContactDetails Contact ) {
//		
//		 ContactDetails response = service.Insert(Contact);
//		 
//		return new ResponseEntity<ContactDetails>(response, HttpStatus.OK);
//	 }
}
