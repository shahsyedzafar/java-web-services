package com.syed.productcrud.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.syed.productcrud.entity.Product; 

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
}
