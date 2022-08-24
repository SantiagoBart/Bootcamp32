package com.BC32.Project1.Service;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.BC32.Project1.Model.Product;

public interface IProductService extends ReactiveCrudRepository<Product,Integer>{

}
