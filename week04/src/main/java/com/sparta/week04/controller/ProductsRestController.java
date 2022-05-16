package com.sparta.week04.controller;

import com.sparta.week04.models.Products;
import com.sparta.week04.models.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController //JSON으로 데이터를 주고받음을 선언
@RequiredArgsConstructor // final로 선언된 멤버 변수를 자동으로 생성
public class ProductsRestController {
    
    // 멤버 변수 생성
    private final ProductsRepository productsRepository;

    // 등록된 전체 상품 목록 조회
    @GetMapping("/api/products")
    public List<Products> selectProducts(){
        return productsRepository.findAll();
    }
}
