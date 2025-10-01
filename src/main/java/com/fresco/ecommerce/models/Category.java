package com.fresco.ecommerce.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int categoryId;

    @Column(unique = true)
    private String categoryName;

    public Category() {
        super();
    }

    public Category( String categoryName) {
        super();
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Category [" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ']';
    }
}
