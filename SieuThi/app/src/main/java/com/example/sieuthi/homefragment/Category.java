package com.example.sieuthi.homefragment;

import java.util.List;

public class Category {

    private int imgPhoto;
    private String name;
    private List<Product> listProduct;

    public Category(int imgPhoto, String name, List<Product> listProduct) {
        this.imgPhoto = imgPhoto;
        this.name = name;
        this.listProduct = listProduct;
    }

    public int getImgPhoto() {
        return imgPhoto;
    }

    public void setImgPhoto(int imgPhoto) {
        this.imgPhoto = imgPhoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }
}
