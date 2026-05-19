package com.codemanship;

public class Product {

	private int quantityStocked = 0;
    private int quantityOnHold = 0;

    public int quantityOnHold() {
        return quantityOnHold;
    }

	public void addStock(int stockToAdd) {
		quantityStocked = quantityStocked + stockToAdd;
	}
	
    public void hold(int quantityToHold) {
        quantityOnHold = quantityOnHold + quantityToHold;
    }

	public boolean hasSufficientQuantity(int quantity) {
		return (quantityStocked - quantityOnHold) >= quantity;
	}
}
