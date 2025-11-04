package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/products")
public String getProduct()
{
	return "Collect your products";
}
	@PostMapping("/add")
	public String addProduct()
	{
		return "Add Prodcut";
	}
}
	