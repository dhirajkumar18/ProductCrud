package com.dhiraj.product.ProductCrud.repository;

import com.dhiraj.product.ProductCrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,String> {
}
