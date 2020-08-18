package com.codeclan.example.Shop_Exchange.models;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @JsonIgnore
//    @JsonBackReference
    @OneToMany(mappedBy="category")
    private List<Product> products;

    public Category (String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProductDescriptions(List<Product> products) {
        this.products = products;
    }
}
