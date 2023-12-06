package com.educandoweb.course.entities;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductTest {

    @Test
    public void testGetSetId() {
        Product product = new Product();
        product.setId(1L);
        assertEquals(1L, product.getId());
    }

    @Test
    public void testGetSetName() {
        Product product = new Product();
        product.setName("Product Name");
        assertEquals("Product Name", product.getName());
    }

    @Test
    public void testGetSetDescription() {
        Product product = new Product();
        product.setDescription("Product Description");
        assertEquals("Product Description", product.getDescription());
    }

    @Test
    public void testGetSetPrice() {
        Product product = new Product();
        product.setPrice(19.99);
        assertEquals(19.99, product.getPrice(), 0.001);
    }

    @Test
    public void testGetSetImgUrl() {
        Product product = new Product();
        product.setImgUrl("http://example.com/image.jpg");
        assertEquals("http://example.com/image.jpg", product.getImgUrl());
    }

    @Test
    public void testGetSetCategories() {
        Product product = new Product();
        Set<Category> categories = new HashSet<>();
        Category category1 = mock(Category.class);
        Category category2 = mock(Category.class);
        categories.add(category1);
        categories.add(category2);

        product.setCategories(categories);
        assertEquals(categories, product.getCategories());
    }

    @Test
    public void testGetOrders() {
        Product product = new Product();
        OrderItem orderItem1 = mock(OrderItem.class);
        OrderItem orderItem2 = mock(OrderItem.class);
        Order order1 = mock(Order.class);
        Order order2 = mock(Order.class);

        when(orderItem1.getOrder()).thenReturn(order1);
        when(orderItem2.getOrder()).thenReturn(order2);

        Set<OrderItem> items = new HashSet<>();
        items.add(orderItem1);
        items.add(orderItem2);

        product.setItems(items);

        Set<Order> orders = product.getOrders();
        assertTrue(orders.contains(order1));
        assertTrue(orders.contains(order2));
    }
}
