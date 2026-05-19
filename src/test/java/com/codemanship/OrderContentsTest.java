package com.codemanship;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class OrderContentsTest {
    @Test
    void addOneProductToOrderIncreasesHoldByOne() {
        Product product = new Product();
        Order order = new Order();
        order.add(product, 1);
        assertEquals(1, product.stockHeld());
    }

    @Test
    void addProductTwiceIncreasesHoldByTwo() {
        Product product = new Product();
        Order order = new Order();
        order.add(product, 2);
        assertEquals(2, product.stockHeld());
    }
    
    @Test
    void addProductToOrderAndOrderRemembersProduct() {
    	List<Product> expectedProducts = new ArrayList<Product>();
        Product product = new Product();
        expectedProducts.add(product);
    	Order order = new Order();
    	order.add(product, 1);
		assertEquals(expectedProducts, order.getProducts());
    }
}
