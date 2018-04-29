package com.rbsample.springmongobulk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;
import org.springframework.stereotype.Service;

import com.rbsample.springmongobulk.document.Product;
import com.rbsample.springmongobulk.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public String createProducts(List<Product> products){
		productRepository.saveAll(products);
		
		return "Saved";
	}
	
	public Optional<Product> getProductById(Long id){
		return productRepository.findById(id);
	}
	
	public List<Product> getProductsByCatergory(int cat){
		
		Query query = new Query();
		query.addCriteria(Criteria.where("category").is(cat));
		return mongoTemplate.find(query , Product.class);
	}
	
	public List<Product> getTop3ExpensiveProducts(double price){
		
		Query query = new BasicQuery("{price: { $gte: " + price + "}}").limit(3);
		return mongoTemplate.find(query, Product.class);
	}
	
	public List<Product> getProductBySupplierRegex(String supplier){
		  return productRepository.findBySupplierRegex(supplier);
	}
	
	public List<Product> getProductBySupplier(String supplier){

		TextCriteria criteria = TextCriteria.forDefaultLanguage()
				  .matchingAny(supplier);
		return productRepository.findAllBy(criteria);
	}
	
	public List<Product> getProductBySupplierQuery(String supplier){

		TextCriteria criteria = TextCriteria.forDefaultLanguage()
				  .matchingAny(supplier);

				Query query = TextQuery.queryText(criteria)
				  .sortByScore()
				  .with(PageRequest.of(0, 5));
				
		return mongoTemplate.find(query, Product.class);
	}

}
