package com.example.tiki.controller;

import com.example.tiki.entity.Product;
import com.example.tiki.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }
    @PutMapping("/edit")
    @ResponseStatus(HttpStatus.OK)
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
    @GetMapping("/")
    public Iterable<Product> getProducts(){
        return productService.getProducts();
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id){
        productService.deleteById(id);
    }
}