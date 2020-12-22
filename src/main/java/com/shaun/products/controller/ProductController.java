package com.shaun.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shaun.products.service.PCService;

@Controller
public class ProductController {
	@Autowired
	public PCService pcService;
	
	@RequestMapping("/new/product")
	public String newProduct() {
		return"newproducts.jsp";
	}
	
	@RequestMapping("/new/category")
	public String newCategory() {
		return "newcategory.jsp";
	}
}
