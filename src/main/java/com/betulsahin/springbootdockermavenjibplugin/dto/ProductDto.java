package com.betulsahin.springbootdockermavenjibplugin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {

    @ApiModelProperty(example = "MacBook Pro M1 256GB")
    @NotEmpty
    @Size(max=50, message = "Product name cannot be greater than 50 characters")
    private String name;

    @ApiModelProperty(example = "MacBook Pro M1 256GB")
    @NotEmpty
    @Size(max=500, message = "Product description cannot be greater than 500 characters")
    private String description;

    @ApiModelProperty(example = "11.999")
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private double price;

    @ApiModelProperty(example = "Dizüstü Bilgisayar")
    @NotEmpty
    @Size(max=50, message = "Category name cannot be greater than 50 characters")
    private String category;
}
