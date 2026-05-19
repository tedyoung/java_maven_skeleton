package com.codemanship;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderContentsTest {

    @Test
    void addOneProductToOrderIncreasesHoldByOne() {
        Product product = new Product();
        product.addStock(1);
        Order order = new Order();
        
        order.add(product, 1);
        
        assertEquals(1, product.quantityOnHold());
    }

    @Test
    void addProductTwiceIncreasesHoldByTwo() {
        Product product = new Product();
        product.addStock(2);
        Order order = new Order();
        
        order.add(product, 2);
        
        assertEquals(2, product.quantityOnHold());
    }
    
    @Test
    void addOneProductToOrderAndOrderItemHasProductWithQuantityOne() {
        Product product = new Product();
        product.addStock(1);
        Order order = new Order();

        order.add(product, 1);

        assertEquals(1, order.getItems().size());
        Item item = order.getItems().get(0);
        assertEquals(1, item.quantity());
        assertEquals(product, item.product());
    }
    
    @Test
    void rejectAddingItemWithInsufficientStock() {
    	Product product = new Product();
    	product.addStock(1);
    	Order order = new Order();
    	
    	order.add(product, 2);
    	
    	assertEquals(0, order.getItems().size());
    }
    
}
