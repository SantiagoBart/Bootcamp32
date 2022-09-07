package com.Bootcamp32.Microservicio01.Controller;

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

import com.Bootcamp32.Microservicio01.Model.ProductType;
import com.Bootcamp32.Microservicio01.Service.IProductTypeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.slf4j.Logger;

@RestController
@RequestMapping("/api/ProductType")
public class ProductTypeController {
	private static final Logger logger = LoggerFactory.getLogger(ProductTypeController.class);
	
	@Autowired
	private IProductTypeService service;
	
	@GetMapping("/list")
	public ResponseEntity<Flux<ProductType>> store()
	{
		Flux<ProductType> response = null;
		try
		{
			logger.info("Tipos de Productos: Listar Iniciando");
			response=service.findAll();
		}
		catch(Exception ex)
		{
			logger.info("Tipos de Productos: Listar Error: " + ex.getMessage());
			return new ResponseEntity<Flux<ProductType>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally
		{
			logger.info("Tipos de Productos: Listar Terminado");
		}
		
		return new ResponseEntity<Flux<ProductType>>(response, HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<Mono<ProductType>> create(@RequestBody ProductType request)
	{
		Mono<ProductType> response = null;
		try
		{
			logger.info("Tipos de Productos: Registrar Iniciando");
			response = service.save(request);			
		}
		catch(Exception ex)
		{
			logger.info("Tipos de Productos: Registrar Error: " + ex.getMessage());
			return new ResponseEntity<Mono<ProductType>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally
		{
			logger.info("Tipos de Productos: Registrar Terminado");
		}
		
		return new ResponseEntity<Mono<ProductType>>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Mono<Void>> delete(Integer id)
	{
		Mono<Void> response = null;
		try
		{
			logger.info("Tipos de Productos: Eliminar Iniciando");
			response=service.deleteById(id);
		}
		catch(Exception ex)
		{
			logger.info("Tipos de Productos: Eliminar Error: " + ex.getMessage());
			return new ResponseEntity<Mono<Void>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally
		{
			logger.info("Tipos de Productos: Eliminar Terminado");
		}
		
		return new ResponseEntity<Mono<Void>>(response, HttpStatus.OK);
	}
}
