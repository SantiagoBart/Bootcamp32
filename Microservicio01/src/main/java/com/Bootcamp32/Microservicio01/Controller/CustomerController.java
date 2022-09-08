package com.Bootcamp32.Microservicio01.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bootcamp32.Microservicio01.Model.Customer;
import com.Bootcamp32.Microservicio01.Model.Product;
import com.Bootcamp32.Microservicio01.Service.ICustomerService;
import com.Bootcamp32.Microservicio01.Service.IProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/Customer")
public class CustomerController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private ICustomerService service;
	
	@GetMapping("/list")
	public ResponseEntity<Flux<Customer>> store(){
		Flux<Customer> response = null;
		try
		{
			logger.info("Productos: Listar Iniciando");
			response = service.findAll();
		}
		catch(Exception ex)
		{
			logger.info("Productos: Listar Error: " + ex.getMessage());
			return new ResponseEntity<Flux<Customer>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally
		{
			logger.info("Productos: Listar Terminado");
		}
		
		return new ResponseEntity<Flux<Customer>>(response, HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<Mono<Customer>> create(@RequestBody Customer request){
		Mono<Customer> response = null;
		try
		{
			logger.info("Productos: Registrar Iniciando");
			response = service.save(request);			
		}
		catch(Exception ex)
		{
			logger.info("Productos: Registrar Error: " + ex.getMessage());
			return new ResponseEntity<Mono<Customer>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally
		{
			logger.info("Productos: Registrar Terminado");
		}
		
		return new ResponseEntity<Mono<Customer>>(response, HttpStatus.OK);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<Mono<Void>> delete(@RequestBody Integer id)
	{
		Mono<Void> response = null;
		try
		{
			logger.info("Productos: Eliminar Iniciando");
			response=service.deleteById(id);
		}
		catch(Exception ex)
		{
			logger.info("Productos: Eliminar Error: " + ex.getMessage());
			return new ResponseEntity<Mono<Void>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally
		{
			logger.info("Productos: Eliminar Terminado");
		}
		
		return new ResponseEntity<Mono<Void>>(response, HttpStatus.OK);
	}
}
