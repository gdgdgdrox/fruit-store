package com.tutorial.microservice.product_service.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.microservice.product_service.model.Product;
import com.tutorial.microservice.product_service.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;

    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        Iterator<Product> productIterator = productRepo.findAll().iterator();
        while (productIterator.hasNext()){
            Product product = productIterator.next();
            products.add(product);
        }
        return products;
    }

}
