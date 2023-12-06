package com.educandoweb.course.entities;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class UserTest {

    @Test
    public void testGetSetId() {
        User user = new User();
        user.setId(1L);
        assertEquals(1L, user.getId());
    }

    @Test
    public void testGetSetName() {
        User user = new User();
        user.setName("John Doe");
        assertEquals("John Doe", user.getName());
    }

    @Test
    public void testGetSetEmail() {
        User user = new User();
        user.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", user.getEmail());
    }

    @Test
    public void testGetSetPhone() {
        User user = new User();
        user.setPhone("123-456-7890");
        assertEquals("123-456-7890", user.getPhone());
    }

    @Test
    public void testGetSetPassword() {
        User user = new User();
        user.setPassword("password123");
        assertEquals("password123", user.getPassword());
    }

    @Test
    public void testGetSetOrders() {
        User user = new User();
        Order order1 = mock(Order.class);
        Order order2 = mock(Order.class);
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);

        user.setOrders(orders);
        assertEquals(orders, user.getOrders());
    }
}
