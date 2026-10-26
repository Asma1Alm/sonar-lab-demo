package com.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    void testAdd() { assertEquals(5, calc.add(2, 3)); }

    @Test
    void testSubtract() { assertEquals(1, calc.subtract(3, 2)); }
}
