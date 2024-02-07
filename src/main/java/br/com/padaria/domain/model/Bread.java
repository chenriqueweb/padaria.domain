package br.com.padaria.domain.model;

import br.com.padaria.domain.model.abstracts.interfaces.IProduct;

public class Bread implements IProduct {

    private double price;
    private double quantity;

    public Bread(Product product) {
        this.price = product.getPrice();
        this.quantity = product.getQuantity();

        BreadBakery(product);
    }

    public void BreadBakery(Product product) {
        double priceQuantity = CalculaTotal(product.getPrice(), product.getQuantity());

        System.out.println("Bread: " + product.getName() + " Valor: " + priceQuantity);
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
    public double CalculaTotal(double price, int quantity) {
        return this.price * this.quantity * 0.5;
    }
}
