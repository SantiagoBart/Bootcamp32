package com.Bootcamp32.Microservicio02.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bootcamp32.Microservicio02.Model.CustomerProduct;

public interface CustomerProductRepository extends JpaRepository<CustomerProduct, Integer> {

}
