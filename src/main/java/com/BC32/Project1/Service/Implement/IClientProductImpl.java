package com.BC32.Project1.Service.Implement;

import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Service;

import com.BC32.Project1.Model.ClientProduct;
import com.BC32.Project1.Service.IClientProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public abstract class IClientProductImpl implements IClientProductService{

	private final CopyOnWriteArrayList<ClientProduct> clientProductList = new CopyOnWriteArrayList<>();
	
	@Override
	public Flux<ClientProduct> findAll() {
		
		return Flux.fromIterable(clientProductList);
	}		
	
}
