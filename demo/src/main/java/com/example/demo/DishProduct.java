package com.example.demo;

import jakarta.persistence.*;

@Entity
public class DishProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Dish dish;
    @ManyToOne
    private Product product;

    public DishProduct(Dish dish, Product product) {
        this.dish = dish;
        this.product = product;
    }

    public DishProduct() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
