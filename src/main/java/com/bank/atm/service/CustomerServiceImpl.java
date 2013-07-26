package com.bank.atm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.atm.dao.CustomerDAO;
import com.bank.atm.entity.Customer;

@Service
@Transactional(readOnly=true)
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDao;

	@Transactional(readOnly=false)
	public void addNewCustomer(Customer customer) {
		customerDao.addNewCustomer(customer);		
	}

	@Transactional(readOnly=false)
	public boolean deleteCustomer(Integer customerId) {
		return customerDao.deleteCustomer(customerId);		
	}

	@Transactional(readOnly=false)
	public boolean updateCustomer(Customer customer) {		
		return customerDao.updateCustomer(customer);
	}

	public Customer getCustomerByID(Integer customerId) {
		return customerDao.getCustomerByID(customerId);		
	}

	public Customer getCustomer(String customerName, String customerPIN) {		
		return customerDao.getCustomer(customerName, customerPIN);
	}

	public List<Customer> getAllCustomers() {		
		return customerDao.getAllCustomers();
	}

}
