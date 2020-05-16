package com.ups.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
/*import org.springframework.jdbc.core.JdbcTemplate;*/
import org.springframework.stereotype.Service;

import com.ups.customer.model.ContactDetails;

@Service
public class Customer_Dao {
	
	private final static String sql_select="SELECT * FROM CUSTOMER_MAINTAINANCE WHERE ACCOUNT_NO = ? ";
//	private final static String sql_insert = "INSERT  ";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Customers> getCustomerDetails(String accno) {
		
		  Object[] params = new Object[] {accno}; 
		  return jdbcTemplate.query(sql_select,params, new CustomerMapper());
		 
	}
	
	public void insertContactDetails(ContactDetails data) {
		// jdbcTemplate.update(sql_insert,data.getDept());
	}
}
