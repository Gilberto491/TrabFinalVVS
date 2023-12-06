package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CategoryResourceTest {

    @Test
    public void testFindAll() {
        // Configuração do mock
        CategoryService serviceMock = mock(CategoryService.class);
        List<Category> expectedCategories = Arrays.asList(new Category(1L, "Category1"), new Category(2L, "Category2"));
        when(serviceMock.findAll()).thenReturn(expectedCategories);

        // Criação da instância de CategoryResource com o mock injetado
        CategoryResource categoryResource = new CategoryResource(serviceMock);

        // Chamada do método findAll
        ResponseEntity<List<Category>> responseEntity = categoryResource.findAll();

        // Verificações
        assertEquals(expectedCategories, responseEntity.getBody());
    }

    @Test
    public void testFindById() {
        // Configuração do mock
        CategoryService serviceMock = mock(CategoryService.class);
        Long categoryId = 1L;
        Category expectedCategory = new Category(categoryId, "Category1");
        when(serviceMock.findById(categoryId)).thenReturn(expectedCategory);

        // Criação da instância de CategoryResource com o mock injetado
        CategoryResource categoryResource = new CategoryResource(serviceMock);

        // Chamada do método findById
        ResponseEntity<Category> responseEntity = categoryResource.findById(categoryId);

        // Verificações
        assertEquals(expectedCategory, responseEntity.getBody());
    }

}
