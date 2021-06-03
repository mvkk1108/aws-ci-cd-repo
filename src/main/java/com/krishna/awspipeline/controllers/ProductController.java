package com.krishna.awspipeline.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.awspipeline.model.Product;
import com.krishna.awspipeline.repos.ProductRepo;

@RestController
@RequestMapping("/products/api")
public class ProductController {
	@Autowired
	private ProductRepo productRepo;
	@GetMapping("/getProducts")
	public ResponseEntity<List<Product>> products()
	{
		return ResponseEntity.status(HttpStatus.OK).body(productRepo.getProducts());
	}

	
	
	
}
