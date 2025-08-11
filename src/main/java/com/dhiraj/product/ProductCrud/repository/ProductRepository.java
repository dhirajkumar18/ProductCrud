package com.dhiraj.product.ProductCrud.repository;

import com.dhiraj.product.ProductCrud.entity.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID> {
}
