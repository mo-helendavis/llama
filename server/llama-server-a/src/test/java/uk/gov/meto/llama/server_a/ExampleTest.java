package uk.gov.meto.llama.server_a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ExampleTest {
    @Test
    public void getString() {
        // Test getString, don't test length since we want a method with no test coverage
        Example example = new Example("TEST");
        assertEquals("TEST",example.getString());
    }

    @Test
    public void getString2() {
        // Test getString, don't test length since we want a method with no test coverage
        Example example = new Example("LLAMA NAME");
        assertEquals("LLAMA NAME",example.getString());
    }
}