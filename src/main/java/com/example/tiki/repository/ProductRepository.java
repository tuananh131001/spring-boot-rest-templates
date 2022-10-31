package com.example.tiki.repository;

import com.example.tiki.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query("SELECT DISTINCT p FROM Product p WHERE LOWER(p.name) LIKE LOWER(CONCAT('%', ?1,'%'))")
    Page<Product> findAllByName(String name, Pageable pageable);
}
