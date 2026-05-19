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
        Product product = new Product();
        Order order = new Order();

        order.add(product, 1);

        List<Product> expectedProducts = List.of(product);
        assertEquals(expectedProducts, order.getProducts());
    }
}
