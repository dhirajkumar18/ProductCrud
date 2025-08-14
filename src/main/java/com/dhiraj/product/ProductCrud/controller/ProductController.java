package com.dhiraj.product.ProductCrud.controller;

import com.dhiraj.product.ProductCrud.entity.Product;
import com.dhiraj.product.ProductCrud.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private final Logger logger= LoggerFactory.getLogger(ProductController.class);
    @PostMapping("/products")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        logger.info("Product creation {}"+product.getName());
        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
    }
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        logger.info("Fetching product details:{}");
        return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }
}
