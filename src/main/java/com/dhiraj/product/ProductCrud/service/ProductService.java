package com.dhiraj.product.ProductCrud.service;

import com.dhiraj.product.ProductCrud.entity.Product;
import com.dhiraj.product.ProductCrud.repository.ProductRepo;
import com.dhiraj.product.ProductCrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepository;
    public Product createProduct(Product product){
        product.setId(UUID.randomUUID().toString());
        return productRepository.save(product);
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public String deleteProductById(String id){
        productRepository.deleteById(id);
        return "product deleted";
    }
    public Product updateProduct(Product product,String id){
        Product productObj=productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("product not found with given id"+id));
        productObj.setName(product.getName());
        productObj.setPrice(product.getPrice());
        return productRepository.save(productObj);
    }
}
