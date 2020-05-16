package com.ups.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ups.customer.dao.Customer_Dao;
import com.ups.customer.dao.Customers;


@Service
public class CustomerService {

	@Autowired
	Customer_Dao custDao;
	
	public List<Customers> test() {
		List<Customers> Cust = custDao.getCustomerDetails();
		return Cust;
	}
	
}
