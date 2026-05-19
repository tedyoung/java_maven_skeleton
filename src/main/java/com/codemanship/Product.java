package com.codemanship;

public class Product {

    private int quantityHeld = 0;

    public int stockHeld() {
        return quantityHeld;
    }

    public void hold(int quantityToHold) {
        quantityHeld = quantityHeld + quantityToHold;
    }
}
