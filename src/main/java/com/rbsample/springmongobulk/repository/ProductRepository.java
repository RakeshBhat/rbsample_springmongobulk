package com.rbsample.springmongobulk.repository;

import java.util.List;

import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.rbsample.springmongobulk.document.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
	
	List<Product> findAllProductBySupplier(TextCriteria criteria);
	
	List<Product> findAllBy(TextCriteria criteria);
	
	@Query(value = "{'supplier': {$regex : ?0, $options: 'i'}}")
	List<Product> findBySupplierRegex(String regexString);

}
