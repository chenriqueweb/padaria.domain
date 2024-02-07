package br.com.padaria.domain;

import br.com.padaria.domain.model.Bread;
import br.com.padaria.domain.model.Dairy;
import br.com.padaria.domain.model.Drink;
import br.com.padaria.domain.model.Product;
import br.com.padaria.domain.model.abstracts.interfaces.IProduct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		// Generics
		List<Product> products = new ArrayList<Product>();

		// Test Drink
		Drink drink = new Drink();

		drink.setName("Leite");
		drink.setDescription("Leite de vaca");
		drink.setPrice(6.50);
		drink.setQuantity(10);

		new Drink(drink);
		products.add(drink);
		System.out.println("-----------------------------------");

		// Test Bread - 1
		Bread bread = new Bread();

		bread.setName("Pão");
		bread.setDescription("Pão francês");
		bread.setPrice(0.50);
		bread.setQuantity(100);

		new Bread(bread);
		products.add(bread);
		System.out.println("-----------------------------------");

		// Test Bread - 2
		bread.setName("Pão");
		bread.setDescription("Pão doce");
		bread.setPrice(2.50);
		bread.setQuantity(12);

		new Bread(bread);
		products.add(bread);
		System.out.println("-----------------------------------");


		// Test Dairy
		Dairy dairy = new Dairy();

		dairy.setName("Queijo");
		dairy.setDescription("Queijo Minas");
		dairy.setPrice(10.00);
		dairy.setQuantity(5);

		new Dairy(dairy);
		products.add(dairy);
		System.out.println("-----------------------------------");


        // List all products
		for (Product prod : products) {
			System.out.println(prod.getName() + " - " +
					           prod.getDescription() + " - " +
					           prod.getPrice() + " - " +
					           prod.getQuantity());
		}
		System.out.println("-----------------------------------");

		System.out.println("<GENERIC> - Lista de Produtos: ");
		print(products.get(0).getName());
	}

	public static <H> void print(H h) {
		System.out.println(h.toString());
	}
}
