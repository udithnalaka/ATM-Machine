package com.bank.atm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bank.atm.entity.Customer;
import com.bank.atm.service.CustomerService;


@Controller
@RequestMapping(value="/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/add" , method= RequestMethod.GET)
	public String addCustomerPage(Map<String, Object> model){
		//ModelAndView model = new ModelAndView("add_customer");
		model.put("customer", new Customer());
		return "add_customer";
	}
	
	@RequestMapping(value="/add/submit", method= RequestMethod.POST)
	public String addNewCustomer(@ModelAttribute Customer customer, Map<String, Object> model){
		//ModelAndView model = new ModelAndView("index");
		
		customerService.addNewCustomer(customer);
		
		String message = "user " + customer.getCust_name() + "added successfully ";
		model.put("message", message);
		
		return "index";
	}
	
	@RequestMapping(value="/list" , method= RequestMethod.GET)
	public String getAllCustomers(Map<String, Object> model){
		//ModelAndView model = new ModelAndView("list_customers");
		
		List<Customer> listOfCustomers = customerService.getAllCustomers();
		if(listOfCustomers != null){
			model.put("customerList", listOfCustomers);
		}		
		return "list_customers";
	}
	
	@RequestMapping(value="/edit/{customerId}", method= RequestMethod.GET)
	public String editCustomerPage(@PathVariable Integer customerId, Map<String, Object> model){
		//ModelAndView model = new ModelAndView("add_customer");
		
		Customer customer = customerService.getCustomerByID(customerId);
		if(customer != null){
			model.put("customer", customer);
		}
		return "add_customer";
	}
	
	@RequestMapping(value="/edit/{customerId}", method= RequestMethod.POST)
	public String editCustomerDetails(@ModelAttribute Customer customer, @PathVariable Integer customerId, 
			Map<String, Object> model){
		//ModelAndView model = new ModelAndView();
		
		if(customerService.updateCustomer(customer) ){
			String message = "Customer details updated Successfully ";
			model.put("message", message);
		}
		
		return "index";
	}
	
	@RequestMapping(value="/delete/{customerId}", method= RequestMethod.GET)
	public String deleteCustomer(@PathVariable Integer customerId, Map<String, Object> model){
		//ModelAndView model = new ModelAndView("index");
				
		if(customerService.deleteCustomer(customerId) ){
			String message = "Customer record deleted Successfully ";
			model.put("message", message);
		}
		
		return "index";
	}
	
}
