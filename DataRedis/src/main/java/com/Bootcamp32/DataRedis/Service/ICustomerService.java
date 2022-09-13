package com.Bootcamp32.DataRedis.Service;

import java.util.Map;

import com.Bootcamp32.DataRedis.Model.Customer;

public interface ICustomerService {
	Map<String, Customer> store();
	
	Customer getById(String id);
	
	void create(Customer customer);
	
	void delete(String id);
}
