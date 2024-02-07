package br.com.padaria.domain.model;

// Exemplo de classe concreta que herda de uma classe abstrata
// Polimorfismo - A classe concreta implementa os metodos abstratos da classe abstrata
public class Dairy extends Product {

    private double price;
    private int quantity;
    private String description;

    public Dairy() {
    }

    public Dairy(Product product) {
        this.price = product.getPrice();
        this.quantity = product.getQuantity();
        this.description = product.getDescription();

        DairyBakery(product);
    }

    public void DairyBakery(Product product) {
        double priceQuantity = CalculaTotal(price, quantity);

        System.out.println("Dairy: " + getName(product) + " Valor: " + priceQuantity);
    }


    @Override
    public double CalculaTotal(double price, int quantity) {
        return price * quantity * 0.3;
    }

    public String getName(Product product) {
        return product.getName() + "---" + this.description;
    }
}
