package com.springjpa.productcatalog.controller;

import com.springjpa.productcatalog.entity.Product;
import com.springjpa.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/addProduct")
    public String showAddProductForm() {
        return "addProduct";
    }

    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute Product product) {
        productService.addProduct(product);
        return "redirect:/";
    }

    @GetMapping("/displayProducts")
    public String displayProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "displayProducts";
    }
}
