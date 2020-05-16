package com.ups.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class Customer_Dao {
	
	private final static String sql="SELECT * FROM CUSTOMER_MAINTAINANCE";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Customers> getCustomerDetails() {
		//Object[] params = new Object[] {accno};
		return jdbcTemplate.query(sql,new CustomerMapper());
	}
}
