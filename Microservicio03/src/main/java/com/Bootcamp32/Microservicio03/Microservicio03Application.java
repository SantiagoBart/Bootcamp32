package com.Bootcamp32.Microservicio03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//Kafka Producer
@EnableEurekaClient
@SpringBootApplication
public class Microservicio03Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservicio03Application.class, args);
	}

}
