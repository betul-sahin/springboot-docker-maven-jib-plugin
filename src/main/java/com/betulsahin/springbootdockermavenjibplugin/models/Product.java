package com.betulsahin.springbootdockermavenjibplugin.models;

import com.betulsahin.springbootdockermavenjibplugin.models.abstractions.BaseEntity;

import javax.persistence.Entity;
import java.time.Instant;
import java.util.Objects;

@Entity
public class Product extends BaseEntity {
    private String name;
    private String description;
    private double price;
    private String category;

    public Product() {
    }

    public Product(long id,
                   String name, String description,
                   double price, String category) {
        super(id);
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        if (!super.equals(o)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPrice(),
                getPrice()) == 0 && getName().equals(product.getName())
                && getDescription().equals(product.getDescription())
                && getCategory().equals(product.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),
                getName(), getDescription(),
                getPrice(), getCategory());
    }
}
