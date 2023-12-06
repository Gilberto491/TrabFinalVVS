package com.educandoweb.course.entities;
import com.educandoweb.course.entities.pk.OrderItemPK;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class OrderItemPKTest {

    @Test
    public void testGetSetOrder() {
        OrderItemPK orderItemPK = new OrderItemPK();
        Order order = mock(Order.class);
        orderItemPK.setOrder(order);
        assertEquals(order, orderItemPK.getOrder());
    }

    @Test
    public void testGetSetProduct() {
        OrderItemPK orderItemPK = new OrderItemPK();
        Product product = mock(Product.class);
        orderItemPK.setProduct(product);
        assertEquals(product, orderItemPK.getProduct());
    }

}
