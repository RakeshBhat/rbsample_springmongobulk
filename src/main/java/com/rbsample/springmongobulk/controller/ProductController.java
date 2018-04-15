package com.rbsample.springmongobulk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rbsample.springmongobulk.document.Product;
import com.rbsample.springmongobulk.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping("/product")
	public ResponseEntity<?> createProducts(@RequestBody List<Product> products){
		
		productService.createProducts(products);
		return ResponseEntity.ok("");		
	}
	
	@GetMapping("/product/{productId}")
	public ResponseEntity<?> getProduct(@PathVariable Long productId){
		
		return ResponseEntity.ok(productService.getProductById(productId));
				
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity<?> deleteProducts(@PathVariable Long productId){
		
		return ResponseEntity.ok("");		
	}
}
