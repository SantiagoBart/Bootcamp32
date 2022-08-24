package com.BC32.Project1.Controller;

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

import com.BC32.Project1.Model.ClientProduct;
import com.BC32.Project1.Model.Product;
import com.BC32.Project1.Service.IProductService;
import com.BC32.Project1.Service.IClientProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/Product")
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	@Autowired
	private IProductService service;
	
	@Autowired IClientProductService clientProductService;
	
	@GetMapping("/list")
	public ResponseEntity<Flux<Product>> list() {
		Flux<Product> response = null;
		try {
			response = service.findAll();
		}
		catch(Exception ex)
		{
			logger.info("Listar Productos Error: " + ex.getMessage());
			return new ResponseEntity<Flux<Product>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}	
		finally {
            logger.info("Listar Productos - Fin");
        }
		
		return new ResponseEntity<Flux<Product>>(response, HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<Mono<Product>> registrar(@RequestBody Product request) {
		Mono<Product> response = null;
		try {
			response = service.save(request);
		}
		catch(Exception ex)
		{
			logger.info("Registrar Error: " + ex.getMessage());
			return new ResponseEntity<Mono<Product>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally {
            logger.info("Registrar - Fin");
        }
		return new ResponseEntity<Mono<Product>>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("delete")
	public ResponseEntity<Mono<Void>> delete(@RequestBody Product request) {
		Mono<Void> response = null;
		try {
			response = service.delete(request);
		}
		catch(Exception ex)
		{
			logger.info("Delete Productos Error: " + ex.getMessage());
			return new ResponseEntity<Mono<Void>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally {
            logger.info("Delete - Fin");
        }
		return new ResponseEntity<Mono<Void>>(response, HttpStatus.OK);
	}	
	
	@PostMapping("/cretateAccount")
	public ResponseEntity<Mono<ClientProduct>> createAccount(@RequestBody ClientProduct request)
	{
		Mono<ClientProduct> response=null;
		Mono<Product> product= null;
		try
		{
			product = service.findById(request.getId());
			if(request.getIdType().getId() == 1) //Cliente Personal
			{
				Flux<Product> productList = clientProductService.findBy
			}
			else
			{
				
			}
		}
		catch(Exception ex)
		{
			
		}
		return response;
	}
}
