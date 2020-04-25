package com.codeclan.example.Shop_Exchange.models;

public enum Status {

    PRIVATE("Private"),
    RENT("Rent"),
    LEND("Lend");

    private final String status;
    Status(String status){
        this.status=status;
    }

    public String getStatus() {
        return status;
    }


}

