package com.example.sieuthi.homefragment;

public class Product {

    private int imgPhoto;
    private int price;
    private String name;

    public Product(int imgPhoto, int price, String name) {
        this.imgPhoto = imgPhoto;
        this.price = price;
        this.name = name;
    }

    public int getImgPhoto() {
        return imgPhoto;
    }

    public void setImgPhoto(int imgPhoto) {
        this.imgPhoto = imgPhoto;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }
}
