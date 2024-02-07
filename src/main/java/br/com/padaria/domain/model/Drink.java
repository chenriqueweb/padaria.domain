package br.com.padaria.domain.model;

// Exemplo de classe concreta que herda de uma classe abstrata
// Polimorfismo - A classe concreta implementa os metodos abstratos da classe abstrata
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
