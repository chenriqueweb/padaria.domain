package br.com.padaria.domain.model.abstracts.interfaces;

import br.com.padaria.domain.model.Product;

public abstract interface IProduct {
    Long getId();
    String getName();

    double CalculaTotal(double price, int quantity);

    String getName(Product product);

    String getDescription();
}
