package br.com.padaria.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// Exemplo de classe abstrata onde seus metodos não precisa ser implementados nas classes filhas
public abstract class Product {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    private Integer quantitySold;

    public Product() {
    }

    public Product(Long id, String name, String description, Double price, Integer quantity, Integer quantitySold) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.quantitySold = quantitySold;
    }

    // POCO - Classe não amenica com metodos proprios
    public double CalculaTotal(double price, int quantity) {
        return this.price * this.quantity;
    }

    public int sumQuantitySold(int quantity) {
        if(this.quantitySold == null) {
            this.quantitySold = 0;
        }
        quantitySold += this.quantitySold + quantity;
        this.setQuantity(quantitySold);

        return this.quantitySold;
    }

    public int getQuantitySold() {
        if(this.quantitySold == null) {
            this.quantitySold = 0;
        }
        return this.quantitySold;
    }
}
