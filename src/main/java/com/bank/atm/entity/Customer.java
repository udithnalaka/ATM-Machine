package com.bank.atm.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblCustomer")
public class Customer implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="cust_id")
	private Integer cust_id;
	
	@Column(name="cust_name")
	private String cust_name;
	
	@Column(name="cust_pin")
	private Integer cust_pin;
	
	@Column(name="cust_joined_date")
	private Timestamp cust_joined_date;
	
	@Column(name="cust_active")
	private Boolean cust_active;	
	
	//private List<Address> custAddressList;
	//private Set<Account> custAccounts;
		
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCust_id() {
		return cust_id;
	}
	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public Integer getCust_pin() {
		return cust_pin;
	}
	public void setCust_pin(Integer cust_pin) {
		this.cust_pin = cust_pin;
	}
	public Timestamp getCust_joined_date() {
		return cust_joined_date;
	}
	public void setCust_joined_date(Timestamp cust_joined_date) {
		this.cust_joined_date = cust_joined_date;
	}
	public Boolean getCust_active() {
		return cust_active;
	}
	public void setCust_active(Boolean cust_active) {
		this.cust_active = cust_active;
	}
	
	/*public List<Address> getCustAddressList() {
		return custAddressList;
	}
	public void setCustAddressList(List<Address> custAddressList) {
		this.custAddressList = custAddressList;
	}
	public Set<Account> getCustAccounts() {
		return custAccounts;
	}
	public void setCustAccounts(Set<Account> custAccounts) {
		this.custAccounts = custAccounts;
	}*/
	
	
	

}
