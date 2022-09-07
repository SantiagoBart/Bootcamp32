package com.Bootcamp32.Microservicio01.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Bootcamp32.Microservicio01.Model.CustomerType;

@Repository
public interface ICustomerTypeRepository extends MongoRepository<CustomerType,Integer>{

}
