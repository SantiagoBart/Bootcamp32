package com.Bootcamp32.Microservicio03.Controller;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bootcamp32.Microservicio03.Beans.Customer;
import com.Bootcamp32.Microservicio03.Beans.KafkaRequest;
import com.Bootcamp32.Microservicio03.Producer.KafkaProducer;
import com.Bootcamp32.Microservicio03.Service.IKafkaService;
import com.google.common.base.Optional;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
	
	private static final Logger logger = LoggerFactory.getLogger(KafkaController.class);
	
	private final KafkaProducer kafkaProducer;
	
	@Autowired
	private IKafkaService service;
	
	@Autowired
	KafkaController(KafkaProducer producer)
	{
		this.kafkaProducer = producer;
	}
	
	@PostMapping(value = "/publish", consumes = "application/json")
	public Mono<String> sendMessageToKafkaTopic(@RequestBody KafkaRequest request)
	{
		Mono<Customer> customer = service.getCustomer(request.getId());
		
		Mono<String> response = null;
		try{
			logger.info("Kafka Producer starter");
			this.kafkaProducer.sendMessage(customer.toString() + "\n Mensaje: " + request.getMessage());			
			response = Mono.just(customer.toString() + "\n Mensaje: " + request.getMessage());
		}catch(Exception ex) {
			logger.info("Kafka Producer Error: " + ex.getMessage());			
		}
		finally {
			logger.info("Kafka Producer ended");
		}		
		return response;		
	}
}
