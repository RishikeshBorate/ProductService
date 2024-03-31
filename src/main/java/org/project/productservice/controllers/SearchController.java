package org.project.productservice.controllers;

import org.project.productservice.Dtos.GenericProductDto;
import org.project.productservice.Dtos.SearchRequestDto;
import org.project.productservice.services.SearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    private SearchService searchService ;

    public SearchController(SearchService searchService){
        this.searchService = searchService ;
    }

//    @PostMapping
//    public List<GenericProductDto> searchProducts(@RequestBody SearchRequestDto requestDto){
//        return searchService.searchProducts(requestDto.getQuery() , requestDto.getPageNumber(), requestDto.getItemsperpage()) ;
//    }

    @PostMapping
    public Page<GenericProductDto> searchProducts(@RequestBody SearchRequestDto requestDto){
        List<GenericProductDto> genericProductDtos =
                searchService.searchProducts(requestDto.getQuery() , requestDto.getPageNumber(), requestDto.getItemsperpage()) ;

        Page<GenericProductDto> genericProductDtoPage = new PageImpl<>(
                genericProductDtos
        );

        return genericProductDtoPage ;
    }
}
