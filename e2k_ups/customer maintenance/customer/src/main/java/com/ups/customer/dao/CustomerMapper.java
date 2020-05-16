package com.ups.customer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customers> {
	@Override
	public Customers mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customers Cust = new Customers();
		Cust.setAccountNo(rs.getString(1));
		Cust.setCustomerName(rs.getString(2));
		Cust.setCreditedOffice(rs.getString(3));
		Cust.setPrimaryAddress(rs.getString(4));
		Cust.setCity(rs.getString(5));
		Cust.setState(rs.getString(6));
		Cust.setZipcode(rs.getString(7));
		Cust.setStatus(rs.getString(8));


		
		return Cust;
}
}
