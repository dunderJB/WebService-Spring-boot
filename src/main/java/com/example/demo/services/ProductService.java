package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productrepository;
	
	public List<Product> findAll(){
		return productrepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> product = productrepository.findById(id);
		return product.get();
	}
}