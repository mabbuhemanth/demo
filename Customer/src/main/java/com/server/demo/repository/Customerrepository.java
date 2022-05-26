package com.server.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.server.demo.entity.Customer;
@Repository
public interface Customerrepository extends CrudRepository<Customer,Integer>{

}
