package br.com.padaria.domain;

import br.com.padaria.domain.model.Bread;
import br.com.padaria.domain.model.Dairy;
import br.com.padaria.domain.model.Drink;
import br.com.padaria.domain.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

        // Test Product
		Product product = new Product();

		// Test Drink
		product.setName("Leite");
		product.setDescription("Leite de vaca");
		product.setPrice(6.50);
		product.setQuantity(10);

		Drink drink = new Drink(product);


		// Test Bread
		product.setName("Pão");
		product.setDescription("Pão francês");
		product.setPrice(0.50);
		product.setQuantity(100);

		Bread bread = new Bread(product);


		// Test Dairy
		product.setName("Queijo");
		product.setDescription("Queijo Minas");
		product.setPrice(10.00);
		product.setQuantity(5);

		Dairy dairy = new Dairy(product);
	}
}
