package com.codeclan.example.Shop_Exchange.models;

public enum ReplaceStatus {

    OLD("Old for new"),
    FEE("Pay Fee");

    private final String replaceStatus;

    ReplaceStatus (String replaceStatus){
        this.replaceStatus=replaceStatus;
    }


    public String getReplaceStatus() {
        return replaceStatus;
    }
}
