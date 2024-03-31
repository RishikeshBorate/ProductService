package org.project.productservice.services;

import org.project.productservice.Dtos.GenericProductDto;
import org.project.productservice.Dtos.SearchRequestDto;
import org.project.productservice.models.Product;
import org.project.productservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

    private ProductRepository productRepository ;

    public SearchService(ProductRepository productRepository){
        this.productRepository = productRepository ;
    }

    public List<GenericProductDto> searchProducts(String query){
        List<Product> products =
                productRepository.findAllByTitleContainingIgnoreCase(query) ;

        List<GenericProductDto> genericProductDtos = new ArrayList<>() ;

        for(Product product : products){
            genericProductDtos.add(product.from(product)) ;
        }

        return genericProductDtos ;

    }
}
