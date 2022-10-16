package com.example.tiki.controller;

import com.example.tiki.entity.Product;
import com.example.tiki.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping("/products/add")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }
    @PutMapping("/products/edit")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
    @GetMapping("/products")
    public Iterable<Product> getProducts(){
        return productService.getProducts();
    }
}