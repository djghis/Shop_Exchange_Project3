package com.codeclan.example.Shop_Exchange.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="phone_number")
    private String phone_number;

    @Email
    @Column(name="email")
    private Email email;

    @OneToMany(mappedBy = "user")
    private List<Product> products;

    @OneToMany(mappedBy = "user")
    private List<Product> borrowedProducts;

    public User(String name, String address, String phone_number, @Email Email email) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
        this.products = new ArrayList<>();
        this.borrowedProducts = new ArrayList<>();
    }

    public User() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getBorrowedProducts() {
        return borrowedProducts;
    }

    public void setBorrowedProducts(List<Product> borrowedProducts) {
        this.borrowedProducts = borrowedProducts;
    }
}


