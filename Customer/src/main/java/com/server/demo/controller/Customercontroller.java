package com.server.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.demo.entity.Customer;
import com.server.demo.service.Customerservimp;

@RestController
@RequestMapping("/api/v1/cust")
public class Customercontroller {
	@Autowired
	Customerservimp repo;
	
	@GetMapping("/getcustomers")
	public List<Customer> getAllcustomers() {
		return repo.getAllcustomers();
	}
	
	
	@PostMapping("/addcustomer")
	public Customer addcustomer(@RequestBody Customer customer) {
		return repo.addcustomer(customer);
	}

}
