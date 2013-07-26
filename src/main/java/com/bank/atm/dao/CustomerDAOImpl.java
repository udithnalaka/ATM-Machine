package com.bank.atm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.atm.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void addNewCustomer(Customer customer) {
		getCurrentSession().save(customer);
		
	}
	
	public boolean updateCustomer(Customer customer) {
		getCurrentSession().update(customer);
		return true;
	}

	public Customer getCustomer(String customerName, String customerPIN) {
		return (Customer)getCurrentSession().get(Customer.class, customerName);
		
	}

	public boolean deleteCustomer(Integer customerId) {
		Customer customertoDelete = null;
		if((customertoDelete = getCustomerByID(customerId)) != null ){
			getCurrentSession().delete(customertoDelete);
			return true;
		}
		return false;
	}

	public Customer getCustomerByID(Integer customerId) {
		return (Customer)getCurrentSession().get(Customer.class, customerId);
		
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers() {
		return getCurrentSession().createQuery("from Customer").list();
		
	}

}
