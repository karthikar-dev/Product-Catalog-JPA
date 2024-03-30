package com.springjpa.productcatalog.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`")
    private Long id; // Unique identifier for the product

    @Column(name = "`name`")
    private String name; // Name of the product

    @Column(name = "`category`")
    private String category; // Category to which the product belongs

    @Column(name = "`price`")
    private Double price; // Price of the product
}
