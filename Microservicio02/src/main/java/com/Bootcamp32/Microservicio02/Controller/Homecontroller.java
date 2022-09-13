package com.Bootcamp32.Microservicio02.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bootcamp32.Microservicio02.Model.CustomerProduct;
import com.Bootcamp32.Microservicio02.Service.Implements.CustomerProductServiceImpl;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/CustomerProduct")
public class Homecontroller {
	private static final Logger logger = LoggerFactory.getLogger(Homecontroller.class);
	
	@Autowired
	private CustomerProductServiceImpl service;
	
	
	@PostMapping("/register")
	public ResponseEntity<CustomerProduct> create(@RequestBody CustomerProduct request){
		CustomerProduct response = null;
		try
		{
			logger.info("Productos: Registrar Iniciando");
			response = service.create(request);			
		}
		catch(Exception ex)
		{
			logger.info("Productos: Registrar Error: " + ex.getMessage());
			return new ResponseEntity<CustomerProduct>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally
		{
			logger.info("Productos: Registrar Terminado");
		}
		
		return new ResponseEntity<CustomerProduct>(response, HttpStatus.OK);
	}
}
