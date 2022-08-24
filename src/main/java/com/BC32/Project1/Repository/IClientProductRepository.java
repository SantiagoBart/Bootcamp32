package com.BC32.Project1.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.BC32.Project1.Model.ClientProduct;

import reactor.core.publisher.Flux;

@Repository
public interface IClientProductRepository extends MongoRepository<ClientProduct,Integer>{
	
	@Query("{'idClient'}: ?0")
	Flux<ClientProduct> fyndByClientId(Integer clientId);
}
