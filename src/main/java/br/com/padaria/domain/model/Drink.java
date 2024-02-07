package br.com.padaria.domain.model;

import br.com.padaria.domain.model.abstracts.interfaces.IProduct;

public class Drink implements IProduct {

    private double price;
    private int quantity;

    public Drink(Product product) {
        this.price = product.getPrice();
        this.quantity = product.getQuantity();

        DrinkBakery(product);
    }

    public void DrinkBakery(Product product) {
        double priceQuantity = CalculaTotal(this.price, this.quantity);

        System.out.println("Drink: " + product.getName() + " Valor: " + priceQuantity);
    }

    @Override
    public double CalculaTotal(double price, int quantity) {
        return this.price * this.quantity * 0.4;
    }

    @Override
    public Long getId() {
        return this.getId();
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public String getDescription() {
        return this.getDescription();
    }
}
