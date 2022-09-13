package com.Bootcamp32.DataRedis.Repository;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.Bootcamp32.DataRedis.Model.Customer;

@Repository
public interface ICustomerRepository {
	Map<String, Customer> findAll();
	
	Customer findById(String id);
	
	void save(Customer customer);
	
	void delete(String id);
}
