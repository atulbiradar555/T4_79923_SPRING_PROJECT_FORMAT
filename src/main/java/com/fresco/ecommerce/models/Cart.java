package com.fresco.ecommerce.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cart {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;

    private double totalAmount;

    //Use UserInfo object to reference the user associated with the cart
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")  //Ensure correct Fk relationship
    @JsonIgnore
    private UserInfo user;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cart")
    private List<CartProduct> cartProducts;

    //default constructor

    public Cart() {
        super();
    }

    //costructor with user and cart products

    public Cart(Integer cartId, Double totalAmount, UserInfo user, List<CartProduct> cartProducts){
        this.cartId = cartId;
        this.totalAmount = totalAmount;
        this.user = user;
        this.cartProducts = cartProducts;
    }

    //constructor with totalAmount and userId (directly passing userId)
    public Cart( Double totalAmount, UserInfo user){
        this.totalAmount = totalAmount;
        this.user= user;
    }

    //getter and setter


    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public List<CartProduct> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List<CartProduct> cartProducts) {
        this.cartProducts = cartProducts;
    }

    @Override
    public String toString() {
        return "Cart [" +
                "cartId=" + cartId +
                ", totalAmount=" + totalAmount +
                ", user=" + user +
                ", cartProducts=" + cartProducts +
                ']';
    }

    public void updateTotalAmount(Double price){
        this.totalAmount += price;
    }

}
