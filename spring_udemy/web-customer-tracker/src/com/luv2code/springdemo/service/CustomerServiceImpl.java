package com.luv2code.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO dao;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return dao.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {

		dao.saveCustomer(customer);

	}

	@Override
	@Transactional
	public void deleteCustomer(int custId) {

		dao.deleteCustomer(custId);
	}

	@Override
	@Transactional
	public Customer getCustomer(int custId) {

		return dao.getCustomer(custId);
	}

	@Override
	@Transactional
	public List<Customer> searchCustomers(String theSearchName) {

		return dao.searchCustomers(theSearchName);
	}

}
