package com.tutorial.microservice.product_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.microservice.product_service.model.Product;
import com.tutorial.microservice.product_service.service.ProductService;

@RestController
@CrossOrigin(originPatterns = "*")
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> returnProducts(){
        System.out.println("In get all products");
        List<Product> products = productService.getAllProducts();    
        return ResponseEntity.ok().body(products);
    }
}
