package com.sparta.week04.controller;

import com.sparta.week04.dto.request.ItemRequestDto;
import com.sparta.week04.utils.NaverShopSearch;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class SearchRequestController {
    private final NaverShopSearch naverShopSearch;

    @GetMapping("/api/search")
    public List<ItemRequestDto> getItems(@RequestParam String query){
        String resultQuery = naverShopSearch.search(query);
        return naverShopSearch.fromJSONtoItems(resultQuery);
    }

}
