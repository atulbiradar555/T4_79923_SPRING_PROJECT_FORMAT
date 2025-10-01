package com.fresco.ecommerce.dto;

import com.fresco.ecommerce.models.*;
import com.fresco.ecommerce.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private UserInfoRepository userRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private CartRepo cartRepo;

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private CartProductRepo cartProductRepo;



    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        loadUserData();
        loadData();
    }


    private void loadData() {

        // Create and save Category entities
        Category category1 = new Category("Fashion");
        Category category2 = new Category("Electronics");
        Category category3 = new Category("Books");
        Category category4 = new Category("Groceries");
        Category category5 = new Category("Medicines");


        categoryRepo.save(category1);
        categoryRepo.save(category2);
        categoryRepo.save(category3);
        categoryRepo.save(category4);
        categoryRepo.save(category5);

        System.out.println("Category Data got loaded in DB");

        // Fetch UserInfo for users (jack and bob) using userId

        UserInfo user3 = userRepo.findById(3).orElseThrow(() -> new RuntimeException("User not found"));
        UserInfo user4 = userRepo.findById(4).orElseThrow(() -> new RuntimeException("User not found"));

        // get categories (use the saved Category objects above, or fetch by id)
        Category cate1 = categoryRepo.findById(2).orElseThrow(() -> new RuntimeException("Category not found"));
        Category cate2 = categoryRepo.findById(5).orElseThrow(() -> new RuntimeException("Category not found"));

        // Create and save Product entities
        Product product1 = new Product("Apple iPad 10.2 8th Gen WiFi 10s Tablet", 29198.0, user3, cate1);
        Product product2 = new Product("Crocin pain relief tablet", 18.0, user4, cate2);

        productRepo.save(product1);
        productRepo.save(product2);

        System.out.println("Product Data got loaded in DB");

        // Fetch UserInfo for users (alice and bob) using userId
        UserInfo user1 = userRepo.findById(1).orElseThrow(() -> new RuntimeException("User not found"));
        UserInfo user2 = userRepo.findById(2).orElseThrow(() -> new RuntimeException("User not found"));

        // Create and save Cart entities
        Cart cart1 = new Cart(26.8, user1); // Pass UserInfo object
        Cart cart2 = new Cart(8.0, user2); // Pass UserInfo objec

        cartRepo.save(cart1);
        cartRepo.save(cart2);

        System.out.println("Cart Data got loaded in DB");

        // Fetch Products for CartProduct or Fetch saved products to get assigned IDs
        Product savedProduct1 = productRepo.findById(product1.getProductId()).orElseThrow(() -> new RuntimeException("Product not found"));
        Product savedProduct2 = productRepo.findById(product2.getProductId()).orElseThrow(() -> new RuntimeException("Product not found"));

        // Create and save CartProduct entities
        CartProduct cartProduct1 = new CartProduct(cart1, savedProduct2, 2);

        // Product 1 in Cart 1
        cartProductRepo.save(cartProduct1);

        System.out.println("CartProduct Data got loaded in DB");
    }

    private void loadUserData() {
        UserInfo user1 = new UserInfo("Alice", passwordEncoder.encode("pass123"), "CONSUMER");
        UserInfo user2 = new UserInfo("Bob", passwordEncoder.encode("pass123"), "CONSUMER");
        UserInfo user3 = new UserInfo("John", passwordEncoder.encode("pass123"), "SELLER");
        UserInfo user4 = new UserInfo("Jane", passwordEncoder.encode("pass123"), "SELLER");

        userRepo.save(user1);
        userRepo.save(user2);
        userRepo.save(user3);
        userRepo.save(user4);

        System.out.println("User Data got loaded in DB");
    }
}
