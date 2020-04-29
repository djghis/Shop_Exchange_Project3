package com.codeclan.example.Shop_Exchange.controllers;


import com.codeclan.example.Shop_Exchange.models.Product;
import com.codeclan.example.Shop_Exchange.models.Status;
import com.codeclan.example.Shop_Exchange.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        return new ResponseEntity(productRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> postProduct(@RequestBody Product product) {
        productRepository.save(product);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Product> putProduct(@RequestBody Product product){
        productRepository.save(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Long> deleteProduct(@PathVariable Long id){
        productRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @GetMapping(value="/search/{searchString}")
    public ResponseEntity<List<Product>> findProductByNameOrDescription(@PathVariable String searchString){
        return new ResponseEntity<>(productRepository.findDistinctByProductDescriptionNameContainsIgnoreCaseAndProductDescriptionStatusNot(searchString, Status.PRIVATE), HttpStatus.OK);
    }
}
