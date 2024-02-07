package br.com.padaria.domain.model.abstracts.interfaces;

public abstract interface IProduct {
    Long getId();
    String getName();

    String getDescription = null;
    double getPrice = 0;
    int getQuantity = 0;

    double CalculaTotal(double price, int quantity);
}
