package com.Bootcamp32.Microservicio02.Service.Implements;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bootcamp32.Microservicio02.Model.CustomerProduct;
import com.Bootcamp32.Microservicio02.Repository.CustomerProductRepository;
import com.Bootcamp32.Microservicio02.Service.ICustomerProductService;

import reactor.core.publisher.Mono;

@Service
public class CustomerProductServiceImpl implements ICustomerProductService{

	private static CustomerProductRepository repo;
	
	public CustomerProduct create(CustomerProduct request)
	{
		return repo.save(request);
	}
	
	public Optional<CustomerProduct> getProducts(Integer id)
	{
		return repo.findById(id);
	}
}
