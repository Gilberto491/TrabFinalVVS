package com.educandoweb.course.entities;

import com.educandoweb.course.entities.enums.OrderStatus;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OrderTest {

    @Test
    public void testGetSetId() {
        Order order = new Order();
        order.setId(1L);
        assertEquals(1L, order.getId());
    }

    @Test
    public void testGetSetMoment() {
        Order order = new Order();
        Instant moment = Instant.now();
        order.setMoment(moment);
        assertEquals(moment, order.getMoment());
    }

    @Test
    public void testGetSetOrderStatus() {
        Order order = new Order();
        OrderStatus orderStatus = OrderStatus.SHIPPED;
        order.setOrderStatus(orderStatus);
        assertEquals(orderStatus, order.getOrderStatus());
    }

    @Test
    public void testGetSetClient() {
        Order order = new Order();
        User client = mock(User.class);
        order.setClient(client);
        assertEquals(client, order.getClient());
    }

    @Test
    public void testGetSetPayment() {
        Order order = new Order();
        Payment payment = mock(Payment.class);
        order.setPayment(payment);
        assertEquals(payment, order.getPayment());
    }

    @Test
    public void testGetSetItems() {
        Order order = new Order();
        OrderItem item1 = mock(OrderItem.class);
        OrderItem item2 = mock(OrderItem.class);
        Set<OrderItem> items = new HashSet<>();
        items.add(item1);
        items.add(item2);

        order.setItems(items);
        assertEquals(items, order.getItens());
    }

    @Test
    public void testGetTotal() {
        Order order = new Order();
        OrderItem item1 = mock(OrderItem.class);
        OrderItem item2 = mock(OrderItem.class);

        when(item1.getSubtotal()).thenReturn(25.0);
        when(item2.getSubtotal()).thenReturn(35.0);

        Set<OrderItem> items = new HashSet<>();
        items.add(item1);
        items.add(item2);

        order.setItems(items);

        assertEquals(60.0, order.getTotal(), 0.001);
    }
}
