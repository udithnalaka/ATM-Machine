package com.bank.atm.dao;

import java.util.List;

import com.bank.atm.entity.Customer;


public interface CustomerDAO {
	
	public void addNewCustomer(Customer customer);
	
	public boolean deleteCustomer(Integer customerId);
	
	public boolean updateCustomer(Customer customer);
	
	public Customer getCustomerByID(Integer customerId);
	
	public Customer getCustomer(String customerName, String customerPIN);
	
	public List<Customer> getAllCustomers();

}
