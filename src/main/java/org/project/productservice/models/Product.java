package org.project.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{
    private String title ;
    private String description ;
    private Category Category ;
    private Long Price ;

}
