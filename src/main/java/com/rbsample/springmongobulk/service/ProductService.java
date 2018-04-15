package com.rbsample.springmongobulk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbsample.springmongobulk.document.Product;
import com.rbsample.springmongobulk.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public String createProducts(List<Product> products){
		productRepository.saveAll(products);
		
		return "Saved";
	}
	
	public Optional<Product> getProductById(Long id){
		return productRepository.findById(id);
	}
}
