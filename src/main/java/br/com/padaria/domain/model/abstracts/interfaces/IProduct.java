package br.com.padaria.domain.model.abstracts.interfaces;

public abstract interface IProduct {
    Long getId();
    String getName();

    double CalculaTotal(double price, int quantity);

    String getDescription();
}
