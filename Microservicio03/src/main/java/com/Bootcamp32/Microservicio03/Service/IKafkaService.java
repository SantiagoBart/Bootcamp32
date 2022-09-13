package com.Bootcamp32.Microservicio03.Service;

import com.Bootcamp32.Microservicio03.Beans.Customer;

import reactor.core.publisher.Mono;

public interface IKafkaService {
	public Mono<Customer> getCustomer(Integer id);
}
