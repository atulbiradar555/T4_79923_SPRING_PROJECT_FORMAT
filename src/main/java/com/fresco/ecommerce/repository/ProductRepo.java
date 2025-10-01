package com.fresco.ecommerce.repository;

import com.fresco.ecommerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


//    List<Product> findByProductNameContainingIgnoreCaseOrCategoryCategoryNameContainingIgnoreCase (String productName);

    List<Product> findBySellerUserId(Integer sellerId);

    Optional<Product> FindBySellerUserIdAndProductId(Integer sellerId, Integer productId);

    List<Product> findByProductNameContainingIgnoreCaseOrCategory_CategoryNameContainingIgnoreCase(String productName, String categoryName);
}
