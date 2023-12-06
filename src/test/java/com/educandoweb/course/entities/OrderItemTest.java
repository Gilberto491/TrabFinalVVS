package com.educandoweb.course.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderItemTest {

    @Test
    public void testGetSetOrder() {
        OrderItem orderItem = new OrderItem();
        Order order = new Order();
        orderItem.setOrder(order);
        assertEquals(order, orderItem.getOrder());
    }

    @Test
    public void testGetSetProduct() {
        OrderItem orderItem = new OrderItem();
        Product product = new Product();
        orderItem.setProduct(product);
        assertEquals(product, orderItem.getProduct());
    }

    @Test
    public void testGetSetQuantity() {
        OrderItem orderItem = new OrderItem();
        orderItem.setQuantity(3);
        assertEquals(3, orderItem.getQuantity());
    }

    @Test
    public void testGetSetPrice() {
        OrderItem orderItem = new OrderItem();
        orderItem.setPrice(15.99);
        assertEquals(15.99, orderItem.getPrice(), 0.001);
    }

    @Test
    public void testGetSubtotal() {
        OrderItem orderItem = new OrderItem();
        orderItem.setQuantity(2);
        orderItem.setPrice(10.50);
        assertEquals(21.00, orderItem.getSubtotal(), 0.001);
    }

}
