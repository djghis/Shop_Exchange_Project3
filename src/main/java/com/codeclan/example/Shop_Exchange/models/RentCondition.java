package com.codeclan.example.Shop_Exchange.models;

public enum RentCondition {

    CLEAN("Clean/CLean"),
    DIRTY("Dirty/Dirty");

    private final String rentCondition;
    RentCondition(String rentCondition){
        this.rentCondition=rentCondition;
    }

    public String getRentCondition() {
        return rentCondition;
    }
}
