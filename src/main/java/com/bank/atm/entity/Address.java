package com.bank.atm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="tblAddress")
public class Address {
		
	
	@Id
    @Column(name="address_id", unique=true, nullable=false)
    @GeneratedValue(generator="gen")
    @GenericGenerator(name="gen", strategy="foreign", parameters= @Parameter(name="property", value="customer"))
	private Integer id;
	
	@Column(name="addressLine1")
	private String addressLine1;
	
	@Column(name="suburb")
	private String suburb;
	
	@Column(name="postcode")
	private String postcode;
	
	@Column(name="state")
	private String state;
	
	@OneToOne
    @PrimaryKeyJoinColumn
	private Customer customer;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
