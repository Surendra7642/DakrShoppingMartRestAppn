package com.dark.service;

import java.util.List;

import com.dark.model.Customer;

public interface CustomerService {
	public Customer saveCustomer(Customer cust);
	public void deleteCustomer(Integer cid);
	public Customer getOne(Integer cid);
	public Customer updateCustomer(Customer cust);
	public List<Customer> getAll();


}
