package br.com.padaria.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;

    public Product() {
    }

    public Product(Long id, String name, String description, Double price, Integer quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public double CalculaTotal(double price, int quantity) {
        return this.price * this.quantity;
    }
}
