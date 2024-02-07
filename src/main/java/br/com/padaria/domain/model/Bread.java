package br.com.padaria.domain.model;

// Exemplo de classe concreta que herda de uma classe abstrata
// Polimorfismo - A classe concreta implementa os metodos abstratos da classe abstrata
public class Bread extends Product {

    private double price;
    private int quantity;

    public Bread() {
    }

    public Bread(Product product) {
        this.price = product.getPrice();
        this.quantity = product.getQuantity();

        BreadBakery(product);

        setQuantitySold(sumQuantitySold(quantity));

        System.out.println("Quantidade total de pães: " + getQuantitySold());
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
