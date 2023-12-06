package com.educandoweb.course.entities;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class CategoryTest {

    @Test
    public void testGetSetId() {
        Category category = new Category();
        category.setId(1L);
        assertEquals(1L, category.getId());
    }

    @Test
    public void testGetSetName() {
        Category category = new Category();
        category.setName("Category Name");
        assertEquals("Category Name", category.getName());
    }

    @Test
    public void testGetSetProducts() {
        Category category = new Category();
        Set<Product> products = new HashSet<>();
        Product product1 = mock(Product.class);
        Product product2 = mock(Product.class);
        products.add(product1);
        products.add(product2);

        category.setProducts(products);
        assertEquals(products, category.getProducts());
    }

}
