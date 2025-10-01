package com.fresco.ecommerce.service;

import com.fresco.ecommerce.dto.ProductResponseDto;
import com.fresco.ecommerce.models.Product;
import com.fresco.ecommerce.models.Category;

import com.fresco.ecommerce.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    private Category category;


    public List<ProductResponseDto> searchProducts(String keyword){
        List<Product> products = productRepo.findByProductNameContainingIgnoreCaseOrCategory_CategoryNameContainingIgnoreCase(keyword, keyword);

        List<ProductResponseDto> productResponseDtoList = new ArrayList<>();

        //        return products.stream().map(product -> new ProductResponseDto(
//                product.getProductId(),
//                product.getProductName(),
//                product.getPrice(),
//                product.getCategory().getCategoryName()
//        )).collect(Collectors.toList());

        for(Product product : products){

            ProductResponseDto productResponseDto = new ProductResponseDto(
                    product.getProductId(),
                    product.getProductName(),
                    product.getPrice(),
                    product.getCategory().getCategoryName()
            );
        productResponseDtoList.add(productResponseDto); // ✅ add each DTO to the list
        }

        return productResponseDtoList;   // ✅ finally return the list
    }


}
