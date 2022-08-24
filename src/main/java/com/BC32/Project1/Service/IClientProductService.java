package com.BC32.Project1.Service;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.BC32.Project1.Model.ClientProduct;
import com.BC32.Project1.Model.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClientProductService extends ReactiveCrudRepository<ClientProduct,Integer>{
	
	public Flux<ClientProduct> productbyClient(Integer idClient);
}
