package com.fresco.ecommerce.controller;

import com.fresco.ecommerce.dto.ProductResponseDto;
import com.fresco.ecommerce.models.Product;
import com.fresco.ecommerce.repository.ProductRepo;
import com.fresco.ecommerce.repository.UserInfoRepository;
import com.fresco.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/api/public")
public class PublicController {


    @Autowired
    ProductRepo productRepo;
    @Autowired
    UserInfoRepository userRepo;
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private ProductService productService;

    @GetMapping("/products/search")
    public ResponseEntity<Object> getProducts(@RequestParam String keyword){
        try{
            List<ProductResponseDto> products =productService.searchProducts(keyword);
            return ResponseEntity.ok(products);
        }
        catch(Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }
}
