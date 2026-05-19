package com.codemanship;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<Item> items = new ArrayList<>();

	public void add(Product product, int quantity) {
		if (product.hasSufficientQuantity(quantity)) {
			product.hold(quantity);
			items.add(new Item(product, quantity));
		}
	}

	public List<Item> getItems() {
		return items;
	}

}
