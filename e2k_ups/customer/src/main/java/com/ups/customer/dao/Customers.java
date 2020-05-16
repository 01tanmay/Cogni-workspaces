package com.ups.customer.dao;

public class Customers {

	private String accountNo;
	private String customerName;
	private String creditedOffice;
	private String primaryAddress;
	private String city;
	private String state;
	private String zipcode;
	private String status;
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountNo() {
		return this.accountNo;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setCreditedOffice(String creditedOffice) {
		this.creditedOffice = creditedOffice;
	}
	
	public String getCreditedOffice() {
		return this.creditedOffice;
	}
	
	public void setPrimaryAddress(String primaryAddress) {
		this.primaryAddress = primaryAddress;
	}
	
	public String getPrimaryAddress() {
		return this.primaryAddress;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getZipcode() {
		return this.zipcode;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
}
