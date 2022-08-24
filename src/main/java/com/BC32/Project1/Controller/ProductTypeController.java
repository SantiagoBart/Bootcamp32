package com.BC32.Project1.Controller;

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

import com.BC32.Project1.Model.ProductTypes;
import com.BC32.Project1.Service.IProductTypeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/ProductType")
public class ProductTypeController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private IProductTypeService service;
	
	@GetMapping("/list")
	public ResponseEntity<Flux<ProductTypes>> list() {
		Flux<ProductTypes> response = null;
		try {
			response = service.findAll();
		}
		catch(Exception ex)
		{
			logger.info("Listar Tipos de Productos Error: " + ex.getMessage());
			return new ResponseEntity<Flux<ProductTypes>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally {
            logger.info("Listar Productos - Fin");
        }
		return new ResponseEntity<Flux<ProductTypes>>(response, HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<Mono<ProductTypes>> registrar(@RequestBody ProductTypes request) {
		Mono<ProductTypes> response = null;
		try {
			response = service.save(request);
		}
		catch(Exception ex)
		{
			logger.info("Registrar Tipo de Producto Error: " + ex.getMessage());
			return new ResponseEntity<Mono<ProductTypes>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally {
            logger.info("Registrar Tipo de Producto - Fin");
        }
		return new ResponseEntity<Mono<ProductTypes>>(response, HttpStatus.OK);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<Mono<Void>> delete(@RequestBody ProductTypes request) {
		Mono<Void> response = null;
		try {
			response = service.delete(request);
		}
		catch(Exception ex)
		{
			logger.info("Delete Tipos de Productos Error: " + ex.getMessage());
			return new ResponseEntity<Mono<Void>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally {
            logger.info("Delete - Fin");
        }
		return new ResponseEntity<Mono<Void>>(response, HttpStatus.OK);
	}
}
