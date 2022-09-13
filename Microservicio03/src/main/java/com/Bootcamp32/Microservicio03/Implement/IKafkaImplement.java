package com.Bootcamp32.Microservicio03.Implement;

import org.springframework.stereotype.Service;

import org.springframework.web.reactive.function.client.WebClient;
import com.Bootcamp32.Microservicio03.Beans.Customer;
import com.Bootcamp32.Microservicio03.Service.IKafkaService;

import reactor.core.publisher.Mono;

@Service
public class IKafkaImplement implements IKafkaService{
	
	private final WebClient webClient;
	
	public IKafkaImplement(WebClient.Builder webClientBuilder){
        this.webClient = webClientBuilder.baseUrl("http://localhost:8091").build();
    }
	
	@Override
	public Mono<Customer> getCustomer(Integer id) {
		
		Customer customer = new Customer();
        Mono<Customer> response = this.webClient.get().uri("/api/Customer/edit/{id}", id).retrieve().bodyToMono(Customer.class);

        return response.flatMap(x -> {
        	customer.setId(x.getId());
        	customer.setName(x.getName());
        	customer.setFirstLastName(x.getFirstLastName());
        	customer.setSecondLastName(x.getSecondLastName());
        	customer.setEmail(x.getEmail());        	
            return Mono.just(customer);
        });		
	}
}
