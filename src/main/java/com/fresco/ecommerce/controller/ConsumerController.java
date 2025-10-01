package com.fresco.ecommerce.controller;

import com.fresco.ecommerce.models.CartProduct;
import com.fresco.ecommerce.models.Product;
import com.fresco.ecommerce.repository.CartProductRepo;
import com.fresco.ecommerce.repository.CartRepo;
import com.fresco.ecommerce.repository.ProductRepo;
import com.fresco.ecommerce.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("api/auth/consumer")
public class ConsumerController {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    CartRepo cartRepo;
    @Autowired
    CartProductRepo cpRepo;
    @Autowired
    UserInfoRepository userRepo;

    @GetMapping("/cart")
    public ResponseEntity<Object> getCart(Principal principal) {

        return null;
    }

    @PostMapping("/cart")
    public ResponseEntity<Object> postCart(Principal principal, Product product) {

        return null;
    }

    @PutMapping("/cart")
    public ResponseEntity<Object> putCart(Principal principal, CartProduct cp) {
        return null;
    }

    @DeleteMapping("/cart")
    public ResponseEntity<Object> deleteCart(Principal principal, Product product) {

        return null;

    }


}
