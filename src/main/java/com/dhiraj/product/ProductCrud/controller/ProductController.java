package com.dhiraj.product.ProductCrud.controller;

import com.dhiraj.product.ProductCrud.entity.Product;
import com.dhiraj.product.ProductCrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
    }
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }
    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable String id){
        return new ResponseEntity<>(productService.deleteProductById(id),HttpStatus.OK);
    }
}
