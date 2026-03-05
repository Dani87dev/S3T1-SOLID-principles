package mySolution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private final User user = new User("Dani", "dani@gmail.com", "Danidanidani123");


    @Test
    void create_valid_User() {

        assertEquals("Dani", user.getName());
        assertEquals("dani@gmail.com", user.getEmail());
        assertEquals("Danidanidani123", user.getPassword());

    }

    @Test
    void testSetters() {
        user.setName("Marc");
        user.setEmail("marc@test.com");
        user.setPassword("NovaPassword123");

        assertEquals("Marc", user.getName());
        assertEquals("marc@test.com", user.getEmail());
        assertEquals("NovaPassword123", user.getPassword());
    }


}
