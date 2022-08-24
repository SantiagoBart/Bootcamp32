package com.BC32.Project1.Service.Implement;

import java.util.concurrent.CopyOnWriteArrayList;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Service;

import com.BC32.Project1.Model.ClientProduct;
import com.BC32.Project1.Model.ProductTypes;
import com.BC32.Project1.Service.IProductTypeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public abstract class IProductTypeImpl implements IProductTypeService{

	private final CopyOnWriteArrayList<ProductTypes> productTypesList = new CopyOnWriteArrayList<>();
	
	@Override
	public Flux<ProductTypes> findAll() {
		
		return Flux.fromIterable(productTypesList);
	}
}
