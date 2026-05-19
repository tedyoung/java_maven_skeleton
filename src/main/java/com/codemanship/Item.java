package com.codemanship;

public class Item {
    private final Product product;
    private final int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int quantity() {
        return quantity;
    }

    public Product product() {
        return product;
    }
}
