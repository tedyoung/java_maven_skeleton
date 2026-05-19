package com.codemanship;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<Product> products = new ArrayList<>();

	public void add(Product product, int quantity) {
		product.hold(quantity);
		products.add(product);
	}

	public List<Product> getProducts() {
		return products;
	}

}
