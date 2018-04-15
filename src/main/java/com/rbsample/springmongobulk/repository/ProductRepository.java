package com.rbsample.springmongobulk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rbsample.springmongobulk.document.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {

}
