package com.finflow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testStandardTransaction() {
        App app = new App();
        assertEquals("Success: Transaction Processed", app.processTransaction(500));
    }

    @Test
    public void testHighValueTransaction() {
        App app = new App();
        assertEquals("Flagged: AML Review Required", app.processTransaction(15000));
    }
}

