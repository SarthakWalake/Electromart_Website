package com.electromart.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.electromart.api.model.Product;

public interface ProductRepository extends MongoRepository<Product,String> {
    
    List<Product> findByCategory(String category);
}
