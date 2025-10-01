package com.fresco.ecommerce.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"cart_id", "product_id"}))
@Entity
public class CartProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cpId;

    @Column(name = "cart_id", insertable = false, updatable = false)
    private int cartId;

    @Column(name = "product_id", insertable = false, updatable = false)
    private int productId;


    @ManyToOne()
    @JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
    @JsonIgnore
    private Cart cart;

    @ManyToOne()
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;

    private Integer quantity = 1;

    public CartProduct() {
        super();
    }

    public CartProduct(Cart cart, Product product, Integer quantity) {
        super();
        this.cart=cart;
        this.product=product;
        this.quantity=quantity;
    }
    public CartProduct(int cartId, int productId, int quantity){
        this.cartId=cartId;
        this.productId=productId;
        this.quantity=quantity;
    }

    //getter and setter


    public int getCpId() {
        return cpId;
    }

    public void setCpId(int cpId) {
        this.cpId = cpId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartProduct [" +
                "cpId=" + cpId +
                ", cartId=" + cartId +
                ", productId=" + productId +
                ", cart=" + cart +
                ", product=" + product +
                ", quantity=" + quantity +
                ']';
    }
}
