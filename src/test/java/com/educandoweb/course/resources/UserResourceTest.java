package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class UserResourceTest {

    @Test
    public void testFindAll() {
        // Arrange
        List<User> users = Arrays.asList(new User(), new User());
        UserService userService = mock(UserService.class);
        when(userService.findAll()).thenReturn(users);

        // Act
        UserResource userResource = new UserResource(userService);
        ResponseEntity<List<User>> response = userResource.findAll();

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(users, response.getBody());
    }

    @Test
    public void testFindById() {
        // Arrange
        Long userId = 1L;
        User user = new User();
        UserService userService = mock(UserService.class);
        when(userService.findById(userId)).thenReturn(user);

        // Act
        UserResource userResource = new UserResource(userService);
        ResponseEntity<User> response = userResource.findById(userId);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(user, response.getBody());
    }

    @Test
    public void testDelete() {
        // Arrange
        Long userId = 1L;
        UserService userService = mock(UserService.class);

        // Act
        UserResource userResource = new UserResource(userService);
        ResponseEntity<Void> response = userResource.delete(userId);

        // Assert
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
        verify(userService, times(1)).delete(userId);
    }

    @Test
    public void testUpdate() {
        // Arrange
        Long userId = 1L;
        User updatedUser = new User();
        UserService userService = mock(UserService.class);
        when(userService.update(eq(userId), any(User.class))).thenReturn(updatedUser);

        // Act
        UserResource userResource = new UserResource(userService);
        ResponseEntity<User> response = userResource.update(userId, updatedUser);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(updatedUser, response.getBody());
    }
}
