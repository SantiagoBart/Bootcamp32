package com.Bootcamp32.Microservicio02.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table
public class CustomerProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
		
	private Integer customerId;
	
	private Integer productId;
	
	private Customer customer;
	
	private Product product;
}
