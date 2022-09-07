package com.Bootcamp32.Microservicio01.Service;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.Bootcamp32.Microservicio01.Model.Product;

public interface IProductService extends ReactiveCrudRepository<Product, Integer>{

}
