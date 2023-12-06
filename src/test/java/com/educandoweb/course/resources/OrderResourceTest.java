package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class OrderResourceTest {

    @Test
    public void testFindAll() {
        // Arrange
        OrderService orderService = mock(OrderService.class);
        List<Order> mockOrderList = Arrays.asList(new Order(), new Order());
        when(orderService.findAll()).thenReturn(mockOrderList);

        OrderResource orderResource = new OrderResource(orderService);

        // Act
        ResponseEntity<List<Order>> response = orderResource.findAll();

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockOrderList, response.getBody());
        verify(orderService, times(1)).findAll();
    }

    @Test
    public void testFindById() {
        // Arrange
        OrderService orderService = mock(OrderService.class);
        Long orderId = 1L;
        Order mockOrder = new Order(orderId);
        when(orderService.findById(orderId)).thenReturn(Optional.of(mockOrder).get());

        OrderResource orderResource = new OrderResource(orderService);

        // Act
        ResponseEntity<Order> response = orderResource.findById(orderId);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockOrder, response.getBody());
        verify(orderService, times(1)).findById(orderId);
    }
}
