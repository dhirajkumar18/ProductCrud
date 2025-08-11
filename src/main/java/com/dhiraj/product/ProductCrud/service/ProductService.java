package com.dhiraj.product.ProductCrud.service;

import com.dhiraj.product.ProductCrud.entity.Product;
import com.dhiraj.product.ProductCrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product createProduct(Product product){
        product.setId(UUID.randomUUID());
        return productRepository.save(product);
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
