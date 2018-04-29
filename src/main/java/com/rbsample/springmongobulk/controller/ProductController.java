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
	
	@GetMapping("/product/id/{productId}")
	public ResponseEntity<?> getProduct(@PathVariable Long productId){
		
		return ResponseEntity.ok(productService.getProductById(productId));
				
	}
	
	@GetMapping("/product/category/{category}")
	public ResponseEntity<?> getProductByCategory(@PathVariable int category){
		return ResponseEntity.ok(productService.getProductsByCatergory(category));
	}
	
	@GetMapping("/product/costly/{price}")
	public ResponseEntity<?> getCostlyProducts(@PathVariable double price){
		return ResponseEntity.ok(productService.getTop3ExpensiveProducts(price));
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity<?> deleteProducts(@PathVariable Long productId){
		
		return ResponseEntity.ok("");		
	}
	
	@GetMapping("/product/supplier/{supplier}")
	public ResponseEntity<?> getProductsBySupplier(@PathVariable String supplier){
		return ResponseEntity.ok(productService.getProductBySupplier(supplier));
	}
}
