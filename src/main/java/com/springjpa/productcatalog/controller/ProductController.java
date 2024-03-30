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

    // Handler method for the home page
    @GetMapping("/")
    public String index() {
        return "index"; // Returns the index.html template
    }

    // Handler method for displaying the add product form
    @GetMapping("/addProduct")
    public String showAddProductForm() {
        return "addProduct"; // Returns the addProduct.html template
    }

    // Handler method for adding a product
    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute Product product) {
        productService.addProduct(product); // Calls the ProductService to add the product to the database
        return "redirect:/"; // Redirects to the home page
    }

    // Handler method for displaying all products
    @GetMapping("/displayProducts")
    public String displayProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts()); // Retrieves all products from ProductService and adds them to the model
        return "displayProducts"; // Returns the displayProducts.html template
    }
}
