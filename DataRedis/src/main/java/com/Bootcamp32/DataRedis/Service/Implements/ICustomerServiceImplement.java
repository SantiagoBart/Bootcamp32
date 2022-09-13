package com.Bootcamp32.DataRedis.Service.Implements;

import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.Bootcamp32.DataRedis.Model.Customer;
import com.Bootcamp32.DataRedis.Repository.ICustomerRepository;
import com.Bootcamp32.DataRedis.Service.ICustomerService;

@Service
public class ICustomerServiceImplement implements ICustomerRepository{
	
	private static final String KEY = "customer";
	private RedisTemplate<String, Customer> template;
	private HashOperations hashOperations;
	
	public ICustomerServiceImplement(RedisTemplate<String, Customer> redisTemplate)
	{
		this.template = redisTemplate;
	}
	
	@PostConstruct
    private void init(){
        hashOperations = template.opsForHash();
    }

	@Override
	public Map<String, Customer> findAll() {
		return hashOperations.entries(KEY);
	}

	@Override
	public Customer findById(String id) {
		return (Customer)hashOperations.get(KEY, id);
	}

	@Override
	public void save(Customer customer) {
		hashOperations.put(KEY, UUID.randomUUID().toString(), customer);
	}

	@Override
	public void delete(String id) {
		hashOperations.delete(KEY, UUID.randomUUID().toString(), id);
	}
}
