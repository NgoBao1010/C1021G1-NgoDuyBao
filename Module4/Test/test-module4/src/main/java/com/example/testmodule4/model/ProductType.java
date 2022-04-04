package com.example.bandaugia.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameProductType;
    public ProductType() {
    }

   @OneToMany(mappedBy = "productType",cascade = CascadeType.ALL)
    private Set<ProductType> productTypeSet;

    public Set<ProductType> getProductTypeSet() {
        return productTypeSet;
    }

    public void setProductTypeSet(Set<ProductType> productTypeSet) {
        this.productTypeSet = productTypeSet;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long idProductType) {
        this.id = idProductType;
    }

    public String getNameProductType() {
        return nameProductType;
    }

    public void setNameProductType(String nameProductType) {
        this.nameProductType = nameProductType;
    }
}
