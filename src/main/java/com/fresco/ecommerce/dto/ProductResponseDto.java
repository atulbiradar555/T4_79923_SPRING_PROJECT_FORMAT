package com.fresco.ecommerce.dto;

public class ProductResponseDto {

    private int productId;
    private String productName;
    private double price;
    private String categoryName;


    public ProductResponseDto(int productId, String productName, Double price, String categoryName) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.categoryName = categoryName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
