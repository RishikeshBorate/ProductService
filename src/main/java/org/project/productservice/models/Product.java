package org.project.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    private String title ;
    private String description ;

    @ManyToOne
    private Category Category ;
    private Long Price ;

}
