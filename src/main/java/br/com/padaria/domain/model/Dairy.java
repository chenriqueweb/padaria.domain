package br.com.padaria.domain.model;

import br.com.padaria.domain.model.abstracts.interfaces.IProduct;

public class Dairy implements IProduct {

    private double price;
    private double quantity;
    private String description;

    public Dairy(Product product) {
        this.price = product.getPrice();
        this.quantity = product.getQuantity();
        this.description = product.getDescription();

        DairyBakery(product);
    }

    public void DairyBakery(Product product) {
        double priceQuantity = CalculaTotal(product.getPrice(), product.getQuantity());

        System.out.println("Dairy: " + getName() + " Valor: " + priceQuantity);
    }


    @Override
    public double CalculaTotal(double price, int quantity) {
        return price * quantity * 0.3;
    }

    @Override
    public Long getId() {
        return this.getId();
    }

    @Override
    public String getName() {
        return this.getDescription();
    }

    @Override
    public String getDescription() {
        return null;
    }
}
