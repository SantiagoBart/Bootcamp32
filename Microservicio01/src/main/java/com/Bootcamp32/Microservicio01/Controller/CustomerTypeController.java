package com.Bootcamp32.Microservicio01.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bootcamp32.Microservicio01.Model.CustomerType;
import com.Bootcamp32.Microservicio01.Service.ICustomerTypeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/CustomerType")
public class CustomerTypeController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerTypeController.class);
	
	@Autowired
	private ICustomerTypeService service;
	
	@GetMapping("/list")
	public ResponseEntity<Flux<CustomerType>> store()
	{
		Flux<CustomerType> response = null;
		try
		{
			logger.info("Tipos de Clientes: Listar Iniciando");
			response = service.findAll();
		}
		catch(Exception ex)
		{
			logger.info("Tipos de Clientes: Listar Error: " + ex.getMessage());
			return new ResponseEntity<Flux<CustomerType>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally
		{
			logger.info("Tipos de Clientes: Listar Terminado");
		}
		
		return new ResponseEntity<Flux<CustomerType>>(response, HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<Mono<CustomerType>> create(@RequestBody CustomerType request)
	{
		Mono<CustomerType> response = null;
		try
		{
			logger.info("Tipos de Clientes: Registrar Iniciando");
			response = service.save(request);			
		}
		catch(Exception ex)
		{
			logger.info("Tipos de Clientes: Registrar Error: " + ex.getMessage());
			return new ResponseEntity<Mono<CustomerType>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally
		{
			logger.info("Tipos de Clientes: Registrar Terminado");
		}
		
		return new ResponseEntity<Mono<CustomerType>>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Mono<Void>> delete(Integer id)
	{
		Mono<Void> response = null;
		try
		{
			logger.info("Tipos de Clientes: Eliminar Iniciando");
			response=service.deleteById(id);
		}
		catch(Exception ex)
		{
			logger.info("Tipos de Clientes: Eliminar Error: " + ex.getMessage());
			return new ResponseEntity<Mono<Void>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally
		{
			logger.info("Tipos de Clientes: Eliminar Terminado");
		}
		
		return new ResponseEntity<Mono<Void>>(response, HttpStatus.OK);
	}
}
