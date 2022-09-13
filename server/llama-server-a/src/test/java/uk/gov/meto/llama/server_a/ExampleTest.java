package uk.gov.meto.llama.server_a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTest {
    @Test
    public void getString() {
        // Test getString, don't test length since we want a method with no test coverage
        Example example = new Example("TEST");
        assertEquals("TEST",example.getString());
    }
}