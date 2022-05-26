package com.server.demo.service;

import java.util.List;

import com.server.demo.entity.Customer;

public interface Customerservice {
	public List<Customer> getAllcustomers();
	public Customer addcustomer(Customer customer);

}
