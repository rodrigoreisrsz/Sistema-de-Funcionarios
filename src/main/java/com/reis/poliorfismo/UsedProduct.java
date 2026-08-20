package com.reis.poliorfismo;

import java.util.Date;

public class UsedProduct extends Product{
    private String manufacture;

    public UsedProduct() {
    }

    public UsedProduct(String name, double price, String manufacture) {
        super(name, price);
        this.manufacture = manufacture;
    }

    @Override
    public String priceTag(){
        return null;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

}
