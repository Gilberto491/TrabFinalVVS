package com.educandoweb.course.entities;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class PaymentTest {

    @Test
    public void testGetSetId() {
        Payment payment = new Payment();
        payment.setId(1L);
        assertEquals(1L, payment.getId());
    }

    @Test
    public void testGetSetMoment() {
        Payment payment = new Payment();
        Instant moment = Instant.now();
        payment.setMoment(moment);
        assertEquals(moment, payment.getMoment());
    }

    @Test
    public void testGetSetOrder() {
        Payment payment = new Payment();
        Order order = mock(Order.class);
        payment.setOrder(order);
        assertEquals(order, payment.getOrder());
    }
}
