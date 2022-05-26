package com.server.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.demo.entity.Customer;
import com.server.demo.repository.Customerrepository;
@Service
public class Customerservimp implements Customerservice{
	@Autowired
	Customerrepository repo;

	@Override
	public List<Customer> getAllcustomers() {
		
		return (List<Customer>) repo.findAll();
	}

	@Override
	public Customer addcustomer(Customer customer) {
		
		return repo.save(customer);
	}

}
