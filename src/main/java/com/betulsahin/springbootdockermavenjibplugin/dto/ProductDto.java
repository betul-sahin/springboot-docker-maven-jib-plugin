package com.betulsahin.springbootdockermavenjibplugin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private long id;

    @NotEmpty
    @Size(max=50, message = "Product name cannot be greater than 50 characters")
    private String name;

    @NotEmpty
    @Size(max=500, message = "Product description cannot be greater than 500 characters")
    private String description;

    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private double price;

    @NotEmpty
    @Size(max=50, message = "Category name cannot be greater than 50 characters")
    private String category;
}
