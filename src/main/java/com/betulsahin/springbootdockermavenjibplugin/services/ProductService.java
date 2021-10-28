package com.betulsahin.springbootdockermavenjibplugin.services;

import com.betulsahin.springbootdockermavenjibplugin.dto.ProductDto;
import com.betulsahin.springbootdockermavenjibplugin.models.Product;
import com.betulsahin.springbootdockermavenjibplugin.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public Optional<Product> create(ProductDto request) {

        Product product = Product.builder()
                .category(request.getCategory())
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .build();

        Product savedProduct = productRepository.save(product);

        return Optional.of(savedProduct);
    }

    @Transactional(readOnly = true)
    public List<ProductDto> getAll() {

        List<Product> products = productRepository.findAll();
        List<ProductDto> productDtoList = new ArrayList<>();

        for (Product product : products) {
            ProductDto productDto = ProductDto.builder()
                    .category(product.getCategory())
                    .name(product.getName())
                    .description(product.getDescription())
                    .price(product.getPrice())
                    .build();

            productDtoList.add(productDto);
        }

        return productDtoList;
    }
}
