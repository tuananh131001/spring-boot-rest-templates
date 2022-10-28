package com.example.tiki.controller;

import com.example.tiki.entity.Category;
import com.example.tiki.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "/api/category")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCategory(@RequestBody Category product) {
        categoryService.addCategory(product);
    }

    @PutMapping("/edit")
    @ResponseStatus(HttpStatus.OK)
    public Category updateCategory(@RequestBody Category product) {
        return categoryService.updateCategory(product);
    }

    @GetMapping("/")
    public Iterable<Category> getCategory() {
        return categoryService.getCategory();
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id) {
        categoryService.deleteById(id);
    }

}
