package com.Bootcamp32.Microservicio01.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Bootcamp32.Microservicio01.Model.ProductType;

@Repository
public interface IProductTypeRepository extends MongoRepository<ProductType,Integer>{

}
