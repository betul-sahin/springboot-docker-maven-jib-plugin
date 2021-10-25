package com.betulsahin.springbootdockermavenjibplugin.utils;

import com.betulsahin.springbootdockermavenjibplugin.models.Product;
import com.betulsahin.springbootdockermavenjibplugin.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitializerRunner implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        // save products to db
        Product product1 = Product.builder()
                .name("Monster Tulpar T7 V20.4 Dizüstü Bilgisayar")
                .description("Monster Tulpar T7 V20.4 Dizüstü Bilgisayar")
                .price(17.099)
                .category("Dizüstü Bilgisayar")
                .build();
        productRepository.save(product1);

        Product product2 = Product.builder()
                .name("HP Pavilion Gaming 15-ec2033nt 4G8U0EA Dizüstü Bilgisayar")
                .description("HP Pavilion Gaming 15-ec2033nt 4G8U0EA Dizüstü Bilgisayar")
                .price(10.199)
                .category("Dizüstü Bilgisayar")
                .build();
        productRepository.save(product2);

        Product product3 = Product.builder()
                .name("Apple MacBook Air 13.3 İnç M1 MGN73TU/A Dizüstü Bilgisayar")
                .description("Apple MacBook Air 13.3 İnç M1 MGN73TU/A Dizüstü Bilgisayar")
                .price(12.396)
                .category("Dizüstü Bilgisayar")
                .build();
        productRepository.save(product3);
    }
}
