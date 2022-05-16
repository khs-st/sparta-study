package com.sparta.week04.service;

import com.sparta.week04.dto.request.ProductsMypriceRequestDto;
import com.sparta.week04.models.Products;
import com.sparta.week04.repository.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class ProductsService {

    private final ProductsRepository productsRepository;

    @Transactional
    public void update(Long id, ProductsMypriceRequestDto requestDto){
        Products products = productsRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
        products.update(requestDto);
    }
}
