package br.com.padaria.domain.model;

public class Drink extends Product {

    private double price;
    private int quantity;

    public Drink() {
    }

    public Drink(Product product) {
        this.price =  product.getPrice();;
        this.quantity = product.getQuantity();

       DrinkBakery(product);
    }

    public void DrinkBakery(Product product) {
        double priceQuantity = CalculaTotal(price, quantity);

        System.out.println("Drink: " + product.getName() + " Valor: " + priceQuantity);
    }

    @Override
    public double CalculaTotal(double price, int quantity) {
        return this.price * this.quantity * 0.4;
    }
}
