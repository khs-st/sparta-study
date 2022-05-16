package com.sparta.week04.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products,Long> {
}
