package com.springjpa.productcatalog.repository;

import com.springjpa.productcatalog.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Repository interface for performing CRUD operations on Product entities
public interface ProductRepository extends JpaRepository<Product, Long> {

}
