package com.sparta.week04.repository;

import com.sparta.week04.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductsRepository extends JpaRepository<Products, Long> {

}
