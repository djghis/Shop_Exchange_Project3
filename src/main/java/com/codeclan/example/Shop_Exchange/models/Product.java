package com.codeclan.example.Shop_Exchange.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;


    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;


    @ManyToOne
    @JoinColumn(name="borrower_id")
    private User borrower;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private int quantity;

    @Column
    private int quantityLent;

    @Enumerated(EnumType.STRING)
    @Column
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column
    private RentCondition rentCondition;

    @Enumerated(EnumType.STRING)
    @Column
    private ReplaceStatus replaceStatus;

    @Column
    private int price;

    public Product(User user, Category category, String name, String description, int quantity, int quantityLent, Status status, RentCondition rentCondition, ReplaceStatus replaceStatus, int price) {
        this.user = user;
        this.category = category;
        this.borrower = null;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.quantityLent = quantityLent;
        this.status = status;
        this.rentCondition = rentCondition;
        this.replaceStatus = replaceStatus;
        this.price = price;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getBorrower() {
        return borrower;
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantityLent() {
        return quantityLent;
    }

    public void setQuantityLent(int quantityLent) {
        this.quantityLent = quantityLent;
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

    public void setPrice(int price) {
        this.price = price;
    }

//    public void lend(User user){
//        this.borrower = user;
//    }
}
