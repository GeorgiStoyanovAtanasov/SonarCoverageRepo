package com.example.demo;

import com.example.demo.Repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductRepo productRepo;
    @GetMapping("/products")
    public Iterable<Product> getAllProducts(){
        return productRepo.findAll();
    }
    @PostMapping("/add/product")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        Product savedProduct = productRepo.save(product);
        return ResponseEntity.ok(savedProduct);
    }
}
