package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        // Check that both instances return the same message
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage() {
        App app = new App();
        // Check that getMessage returns "Hello World!"
        assertEquals("Hello World!", app.getMessage());
    }
}
