package org.project.productservice.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id ;
    private String title ;
    private Long price ;
    private String category ;
    private String description ;
    private String image ;
}
