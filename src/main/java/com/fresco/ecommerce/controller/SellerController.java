package com.fresco.ecommerce.controller;


import com.fresco.ecommerce.models.Product;
import com.fresco.ecommerce.repository.CategoryRepo;
import com.fresco.ecommerce.repository.ProductRepo;
import com.fresco.ecommerce.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/api/auth/seller")
public class SellerController {

    @Autowired
    ProductRepo productRepo;
    @Autowired
    UserInfoRepository userRepo;
    @Autowired
    CategoryRepo categoryRepo;

    @PostMapping("/product")
    public ResponseEntity<Object> postProduct(Principal principal, Product product) {
        return null;
    }


    @GetMapping("/product")
    public ResponseEntity<Object> getAllProducts(Principal principal) {

        return null;

    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<Object> getProduct(Principal principal, Integer productId) {
        return null;

    }

    @PutMapping("/product")
    public ResponseEntity<Object> putProduct(Principal principal, Product updatedProduct) {
        return null;
    }


    @DeleteMapping("/product/{productId}")
    public ResponseEntity<Product> deleteProduct(Principal principal, Integer productId) {

        return null;
    }
}