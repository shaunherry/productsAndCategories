package com.shaun.products.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shaun.products.models.Category;
import com.shaun.products.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	
	
	List<Product>findAll();
	
	
}
   