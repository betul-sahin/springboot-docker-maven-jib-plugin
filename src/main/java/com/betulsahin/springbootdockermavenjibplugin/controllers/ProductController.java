package com.betulsahin.springbootdockermavenjibplugin.controllers;

import com.betulsahin.springbootdockermavenjibplugin.dto.ProductDto;
import com.betulsahin.springbootdockermavenjibplugin.models.Product;
import com.betulsahin.springbootdockermavenjibplugin.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Product> create(@Valid @RequestBody ProductDto request){

        Optional<Product> productOptional = productService.create(request);
        if(!productOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(productOptional.get(), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAll(){
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }

}
