package patterns.chain_of_responsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import patterns.chain_of_responsibility.RegistrationService.RegistrationService;
import patterns.chain_of_responsibility.RegistrationService.UserInput;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RegistrationServiceTest {
    private RegistrationService service;

    @BeforeEach
    void setUp() {
        service = new RegistrationService();
    }

    @Test
    void shouldRegister() {
        var input = new UserInput("name", "password", "email@gmail.com");

        assertDoesNotThrow(() -> service.register(input));
    }

    @Test
    void shouldThrowUsernameValidationException () {
        var input = new UserInput("na", "password", "email@gmail.com");

        Exception e = assertThrows(IllegalArgumentException.class, () -> service.register(input));
        assertEquals("Name must be at least 4 characters long", e.getMessage());
    }

    @Test
    void shouldThrowPasswordValidationException () {
        var input = new UserInput("name", "pass", "email@gmail.com");

        Exception e = assertThrows(IllegalArgumentException.class, () -> service.register(input));
        assertEquals("Password must be at least 8 characters", e.getMessage());
    }

    @Test
    void shouldThrowEmailValidationException () {
        var input = new UserInput("name", "password", "email");

        Exception e = assertThrows(IllegalArgumentException.class, () -> service.register(input));
        assertEquals("Invalid email address", e.getMessage());
    }

    @Test
    void shouldThrowUniqueUserValidationException () {
        var input = new UserInput("name", "password", "email@gmail.com");

        service.register(input);

        Exception e = assertThrows(IllegalArgumentException.class, () -> service.register(input));
        assertEquals("Username already exists", e.getMessage());
    }
}
