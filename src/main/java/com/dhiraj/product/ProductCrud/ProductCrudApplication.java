package com.dhiraj.product.ProductCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


//@EnableCassandraRepositories(basePackages ="com.dhiraj.product.ProductCrud.repository" )
@SpringBootApplication
@EntityScan(basePackages = "com.dhiraj.product.ProductCrud.entity")
public class ProductCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCrudApplication.class, args);
	}

}
