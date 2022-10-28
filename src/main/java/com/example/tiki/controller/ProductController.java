package com.example.tiki.controller;

import com.example.tiki.entity.Product;
import com.example.tiki.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@CrossOrigin("*")
@RestController
@RequestMapping(path = "/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PutMapping("/edit")
    @ResponseStatus(HttpStatus.OK)
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

//    @GetMapping("/")
//    public Iterable<Product> getProducts(){
//        return productService.getProducts();
//    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id) {
        productService.deleteById(id);
    }

    @GetMapping("")
    public ResponseEntity<Map<String, Object>> getAllProductPage(
            @RequestParam(required = false) String name,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size,
            @RequestParam(defaultValue = "id,desc") String[] sort

    ) {
        return productService.getAllProduct(name, page, size, sort);
    }
}