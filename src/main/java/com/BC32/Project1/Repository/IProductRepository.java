package com.BC32.Project1.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.BC32.Project1.Model.Product;

import reactor.core.publisher.Flux;

@Repository
public interface IProductRepository extends MongoRepository<Product,Integer>{
	
}
