package com.codeclan.example.Shop_Exchange.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "productdescriptions")
public class ProductDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String name;

    @Column
    private String description;

//    @JsonIgnoreProperties(value={"productsde"})
    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;

    @Column
    private String status;

    @Column
    private String rentCondition;

    @Column
    private String replaceStatus;

    @Column
    private int price;


    public ProductDescription(String name, String description, Category category, String status, String rentCondition, String replaceStatus, int price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.status = status;
        this.rentCondition = rentCondition;
        this.replaceStatus = replaceStatus;
        this.price = price;
    }

    public ProductDescription() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public RentCondition getRentCondition() {
        return rentCondition;
    }

    public void setRentCondition(RentCondition rentCondition) {
        this.rentCondition = rentCondition;
    }

    public ReplaceStatus getReplaceStatus() {
        return replaceStatus;
    }

    public void setReplaceStatus(ReplaceStatus replaceStatus) {
        this.replaceStatus = replaceStatus;
    }

    public int getPrice() {
        return price;
    }

}
