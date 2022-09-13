package com.Bootcamp32.DataRedis.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bootcamp32.DataRedis.Model.Customer;
import com.Bootcamp32.DataRedis.Service.Implements.ICustomerServiceImplement;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	ICustomerServiceImplement service;
	
	public CustomerController(ICustomerServiceImplement customerService){
        this.service = customerService;
    }
	
	 @GetMapping
    public Map<String, Customer> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable String id){
        return service.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Customer customer){
    	service.save(customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
    	service.delete(id);
    }
}
