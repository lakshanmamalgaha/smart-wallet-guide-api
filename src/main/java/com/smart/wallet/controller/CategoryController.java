package com.smart.wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smart.wallet.model.Category;
import com.smart.wallet.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping(
			  value = "/createCategory", consumes = "application/json", produces = "application/json")
	public Category createCategory(@RequestBody Category category) {
		return categoryService.createCategory(category);
	}

}
