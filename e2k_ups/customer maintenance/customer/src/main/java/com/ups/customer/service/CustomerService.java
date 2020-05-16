package com.ups.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ups.customer.dao.Customer_Dao;
import com.ups.customer.dao.Customers;
import com.ups.customer.model.ContactDetails;


@Service
public class CustomerService {

	@Autowired
	Customer_Dao custDao;
	Customers customers;
	
	public List<Customers> test(String accno) {
		List<Customers> Cust = custDao.getCustomerDetails(accno);
		return Cust;
	}
	
	public ContactDetails Insert(ContactDetails Contact) {
		System.out.println(Contact);
		ContactDetails data = new ContactDetails();
		data.setDept(Contact.getDept());
		data.setFirstname(Contact.getFirstname());
		data.setLastname(Contact.getLastname());
		data.setMiddlename(Contact.getMiddlename());
		data.setJobtitle(Contact.getJobtitle());
		data.setDesignation(Contact.getDesignation());
			
		custDao.insertContactDetails(data);
		
		return data;
	}
	
}
