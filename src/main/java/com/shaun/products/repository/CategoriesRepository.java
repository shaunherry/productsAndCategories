package com.shaun.products.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shaun.products.models.Category;

public interface CategoriesRepository extends CrudRepository<Category, Long> {

	
	List<Category>findAll();
}
