package org.project.productservice.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchRequestDto {
    private String query ;
    private int pageNumber ;
    private int itemsperpage ;
}
