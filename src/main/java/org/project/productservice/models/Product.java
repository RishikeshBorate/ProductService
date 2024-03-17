package org.project.productservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    private String title ;
    private String description ;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Category Category ;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, optional = false)
    @JoinColumn(nullable = false, unique = true)
    private Price Price ;

}
