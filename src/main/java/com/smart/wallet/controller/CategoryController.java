package com.smart.wallet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smart.wallet.model.Category;
import com.smart.wallet.model.Transaction;
import com.smart.wallet.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping(
			  value = "/api/createCategory", consumes = "application/json", produces = "application/json")
	public Category createCategory(@RequestBody Category category) {
		return categoryService.createCategory(category);
	}
	
	@RequestMapping(value="/api/getByCategory",method=RequestMethod.GET)
	public List<Category> getAllByMonthYear(@RequestParam(value="category", required=false, defaultValue="")String category){
		return categoryService.getByCategory(category);
	}
}
