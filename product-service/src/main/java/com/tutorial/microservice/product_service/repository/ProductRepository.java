package com.tutorial.microservice.product_service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.microservice.product_service.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>{
    
}
