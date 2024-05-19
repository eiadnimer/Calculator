package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testSum() {
        assertEquals(5, calculator.sum(2, 3));
        assertEquals(-1, calculator.sum(-2, 1));
        assertEquals(0, calculator.sum(-3, 3));
    }

    @Test
    void testSub() {
        assertEquals(1, calculator.sub(3, 2));
        assertEquals(-3, calculator.sub(-2, 1));
        assertEquals(-6, calculator.sub(-3, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(-6, 3));
        assertEquals(0, calculator.divide(0, 3));
        assertThrows(DivideByZero.class,
                () -> calculator.divide(1, 0));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-2, 1));
        assertEquals(0, calculator.multiply(0, 3));
        assertEquals(9, calculator.multiply(-3, -3));
    }

}

