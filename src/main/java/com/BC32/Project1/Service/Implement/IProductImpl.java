package com.BC32.Project1.Service.Implement;

import java.util.concurrent.CopyOnWriteArrayList;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Service;

import com.BC32.Project1.Model.Product;
import com.BC32.Project1.Service.IProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public abstract class IProductImpl implements IProductService{

	private final CopyOnWriteArrayList<Product> productList = new CopyOnWriteArrayList<>();
	
	@Override
	public Flux<Product> findAll() {
		
		return Flux.fromIterable(productList);
	}

}
