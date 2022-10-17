package com.example.tiki.service;

import com.example.tiki.entity.Category;
import com.example.tiki.entity.Product;
import com.example.tiki.repository.CategoryRepository;
import com.example.tiki.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
    public Iterable<Category> getCategory(){
        return categoryRepository.findAll();
    }
    public void addCategory(Category product){
        categoryRepository.save(product);
    }
    public Category updateCategory(Category category){
        categoryRepository.save(category);
        return category;
    }
    public void deleteById(Integer id){
        categoryRepository.deleteById(id);
    }
}
