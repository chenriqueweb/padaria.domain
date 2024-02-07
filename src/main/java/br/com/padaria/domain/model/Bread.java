package br.com.padaria.domain.model;

import br.com.padaria.domain.model.abstracts.interfaces.IProduct;

public class Bread extends Product {

    private double price;
    private int quantity;

    public Bread() {
    }

    public Bread(Product product) {
        this.price = product.getPrice();
        this.quantity = product.getQuantity();

        BreadBakery(product);
    }

    public void BreadBakery(Product product) {
        double priceQuantity = CalculaTotal(price, quantity);

        System.out.println("Bread: " + product.getName() + " Valor: " + priceQuantity);
    }

    @Override
    public double CalculaTotal(double price, int quantity) {
        return this.price * this.quantity * 0.5;
    }
}
