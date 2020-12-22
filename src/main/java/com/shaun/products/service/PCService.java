package com.shaun.products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaun.products.models.Category;
import com.shaun.products.models.Product;
import com.shaun.products.repository.CategoriesRepository;
import com.shaun.products.repository.ProductRepository;



@Service
public class PCService {
	
	@Autowired
	private CategoriesRepository cRepo;
	@Autowired
	private ProductRepository pRepo;
	
	
	
	
	public List<Product> Pall(){
		return pRepo.findAll();
	}
	public List<Category> all(){
		return cRepo.findAll();
	}
	
	public Product createProduct(Product products) {
        return pRepo.save(products);
    }
    public Category createCategory(Category categories) {
        System.out.println(categories);
        return cRepo.save(categories);
    }
    
    public Category getCategory(Long id) {
    	Optional<Category> categories = cRepo.findById(id);
    	return categories.isPresent() ? categories.get(): null;
    }
    
    public Product getProduct(Long id) {
    	Optional<Product> products = pRepo.findById(id);
    	return products.isPresent() ? products.get(): null;
    }
    public Product deleteC(Long id) {
		pRepo.deleteById(id);
		return null;
	}
    public Category deleteP(Long id) {
		cRepo.deleteById(id);
		return null;
	}
    public Product findP(Long id) {
		Optional<Product> optionalProduct = pRepo.findById(id);
		if(optionalProduct.isPresent()) {
			return optionalProduct.get();
		} else {
			return null;
		}
	}
    public Category findC(Long id) {
		Optional<Category> optionalCategory = cRepo.findById(id);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();
		} else {
			return null;
		}
		
		
	}


    
    
    
    
    
    
    
    
    
    
    
    
}
