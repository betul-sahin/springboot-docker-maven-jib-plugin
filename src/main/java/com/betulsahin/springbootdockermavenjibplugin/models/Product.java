package com.betulsahin.springbootdockermavenjibplugin.models;

import com.betulsahin.springbootdockermavenjibplugin.models.abstractions.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product extends BaseEntity {

    private String name;
    private String description;
    private double price;
    private String category;

}
