package com.codeclan.example.Shop_Exchange.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name= "rentals")
public class Rental {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @JsonIgnore
//    @JsonBackReference
    @JsonIgnoreProperties(value={"name", "address", "phone_number", "email", "products", "rentals"})
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User renter;

    @JsonIgnoreProperties(value={"rentals"})
    @ManyToOne
    @JoinColumn(name="product_id", nullable = false)
    private Product product;

    @Column
    private int quantity;

    @Column
    private String note;

    @Column
    private String rentalStartDate;

    @Column
    private String rentalEndDate;

    @Column
    private Boolean returned;

    public Rental(User renter, Product product, int quantity, String note, String rentalStartDate, String rentalEndDate) {
        this.renter = renter;
        this.product = product;
        this.quantity = quantity;
        this.note = note;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
        this.returned = false;
    }

    public Rental() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getRenter() {
        return renter;
    }

    public void setRenter(User renter) {
        this.renter = renter;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(String rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public String getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(String rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }

    public Boolean getReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }
}
