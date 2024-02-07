package br.com.padaria.domain.model;

import br.com.padaria.domain.model.abstracts.interfaces.IProduct;

public class Dairy implements IProduct {

    private double price;
    private double quantity;

    public Dairy(Product product) {
        this.price = product.getPrice();
        this.quantity = product.getQuantity();

        DairyBakery(product);
    }

    public void DairyBakery(Product product) {
        double priceQuantity = CalculaTotal(product.getPrice(), product.getQuantity());

        System.out.println("Dairy: " + product.getName() + " Valor: " + priceQuantity);
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
        return price * quantity * 0.3;
    }
}
