package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRESTController {

	@Autowired
	private CustomerService service;

	@GetMapping("/customers")
	public List<Customer> getCustomers() {

		return service.getCustomers();
	}

	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {

		Customer myCustomer = service.getCustomer(customerId);

		if (myCustomer == null)
			throw new CustomerNotFoundException("Customer id not found: " + customerId);

		return myCustomer;
	}

	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer theCustomer) {

		theCustomer.setId(0);

		service.addCustomer(theCustomer);

		return theCustomer;
	}

	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {

		service.saveCustomer(customer);
		return customer;

	}

	@DeleteMapping("/customers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {

		Customer tempCustomer = service.getCustomer(customerId);

		if (tempCustomer == null)
			throw new CustomerNotFoundException("Customer id not found: " + customerId);
		else
			service.deleteCustomer(customerId);

		return "Deleted Cutomer Id: " + customerId;

	}
}