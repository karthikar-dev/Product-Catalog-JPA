package com.springjpa.productcatalog.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="`id`")
    private Long id;
    @Column(name="`name`")
    private String name;
    @Column(name="`category`")
    private String category;
    @Column(name="`price`")
    private Double price;
}