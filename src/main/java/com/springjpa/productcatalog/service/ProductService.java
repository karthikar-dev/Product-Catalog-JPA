package com.springjpa.productcatalog.service;

import com.springjpa.productcatalog.entity.Product;
import com.springjpa.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository; // Injecting ProductRepository for data access

    // Method to retrieve all products from the repository
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Method to add a new product to the repository
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
