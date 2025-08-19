package com.dhiraj.product.ProductCrud.repository;

import com.dhiraj.product.ProductCrud.entity.Product1;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product1, UUID> {
}
