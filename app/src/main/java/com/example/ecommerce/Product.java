package com.example.ecommerce;

enum Type {
    men,
    women,
    kids,
    baby,
    shoes,
    sale
}

public class Product {

    final String name;
    final double price;
    final int image;
    final Type type;
    double sale = 0;
    float rate = 3;
    boolean favourite = false;

    public Product(String name, double price, int image, Type type) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.type = type;
    }

    public Product(String name, double price, int image, Type type, double sale) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.sale = sale;
        this.type = type;
    }

    boolean isSale(){
        return sale != 0;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
