package com.infy.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}
