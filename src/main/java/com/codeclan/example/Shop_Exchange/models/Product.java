package com.codeclan.example.Shop_Exchange.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value={"name", "address", "phone_number", "email", "products", "rentals"})
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @Column
    private String name;

    @Column
    private String description;


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
    private int quantity;

    @Column
    private int price;

//    @JsonIgnore
    @JsonIgnoreProperties(value={"product"})
    @OneToMany(mappedBy="product")
    private List<Rental> rentals;



    public Product(User user, String name, String description, Category category, String status, String rentCondition, String replaceStatus, int price, int quantity) {
        this.user = user;
        this.name = name;
        this.description = description;
        this.category = category;
        this.status = status;
        this.rentCondition = rentCondition;
        this.replaceStatus = replaceStatus;
        this.price = price;
        this.quantity = quantity;
        this.rentals = new ArrayList<>();
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRentCondition() {
        return rentCondition;
    }

    public void setRentCondition(String rentCondition) {
        this.rentCondition = rentCondition;
    }

    public String getReplaceStatus() {
        return replaceStatus;
    }

    public void setReplaceStatus(String replaceStatus) {
        this.replaceStatus = replaceStatus;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }
}
