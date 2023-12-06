package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductResourceTest {

    @Test
    public void testFindAll() {
        // Arrange
        ProductService productService = mock(ProductService.class);
        List<Product> mockProductList = Arrays.asList(new Product(), new Product());
        when(productService.findAll()).thenReturn(mockProductList);

        ProductResource productResource = new ProductResource(productService);

        // Act
        ResponseEntity<List<Product>> response = productResource.findAll();

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockProductList, response.getBody());
    }

    @Test
    public void testFindById() {
        // Arrange
        ProductService productService = mock(ProductService.class);
        Long productId = 1L;
        Product mockProduct = new Product(productId);
        when(productService.findById(productId)).thenReturn(Optional.of(mockProduct).get());

        ProductResource productResource = new ProductResource(productService);

        // Act
        ResponseEntity<Product> response = productResource.findById(productId);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockProduct, response.getBody());
    }
}
