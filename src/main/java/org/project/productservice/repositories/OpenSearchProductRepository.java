package org.project.productservice.repositories;

import org.project.productservice.models.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OpenSearchProductRepository extends ElasticsearchRepository<Product , UUID>{

    List<Product>findAllByTitleContainingIgnoreCase(String title , Pageable pageable) ;

    Optional<Product> findById(UUID uuid);

    Product save(Product product) ;


}
