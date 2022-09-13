package uk.gov.meto.llama.server_b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnotherExampleTest {
    @Test
    public void getString() {
        // Test getString, don't test length since we want a method with no test coverage
        AnotherExample example = new AnotherExample("TEST");
        assertEquals("TEST",example.getString());
    }
}