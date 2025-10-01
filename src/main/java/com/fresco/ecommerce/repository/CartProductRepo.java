package com.fresco.ecommerce.repository;

import com.fresco.ecommerce.models.CartProduct;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CartProductRepo extends JpaRepository<CartProduct, Integer> {

    Optional<CartProduct> findByCartUserUserIdAndProductProductId(Integer userId, Integer productId);


    @Transactional
    void deleteByCartUserUserIdAndProductProductId(Integer userId, Integer productId);


}
