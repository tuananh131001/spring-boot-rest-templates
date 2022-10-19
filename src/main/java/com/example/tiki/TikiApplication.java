package com.example.tiki;

import com.example.tiki.entity.Category;
import com.example.tiki.entity.Product;
import com.example.tiki.repository.CategoryRepository;
import com.example.tiki.repository.ProductRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class TikiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TikiApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(
            ProductRepository productRepository,
            CategoryRepository categoryRepository
    ){
        return args -> {
            Faker faker = new Faker();
            Category category1 = new Category(0,"electronics",null,"yes",null);
            Category category2 = new Category(1,"Laptop",null,"yes",null);
            Product product1 = new Product(0,faker.name().name(),
                    "sdjsj","asus",1,category2);
            Product product2 = new Product(1,faker.name().name(),
                    "apple","asus",1,category2);
            Product product3 = new Product(2,faker.name().name(),
                    "netflix","asus",2,category1);
            Product product4= new Product(3,faker.name().name(),
                    "google","asus",3,category1);
            Product product5= new Product(4,faker.name().name(),
                    "google","asus",3,category1);
            Product product6= new Product(5,faker.name().name(),
                    "google","asus",3,category1);
            Product product7= new Product(6,faker.name().name(),
                    "google","asus",3,category1);

            category1.setProductList(new ArrayList<>(Arrays.asList(product3,product4,product5,product6,product7)));// add item to list in category
            category2.setProductList(new ArrayList<>(Arrays.asList(product1,product2)));// add item to list in category
//            category2.setProductList(List.of(product1,product2));// add item to list in category
            categoryRepository.saveAllAndFlush(new ArrayList<>(Arrays.asList(category1,category2))); // save category with item with CASETYPE ALL


        };

    }
}
