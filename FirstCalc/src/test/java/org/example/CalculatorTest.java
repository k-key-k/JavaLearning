package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void TestAddition() {
        assertEquals(5.0, calculator.add(2, 3), "2 + 3 = 5");
        assertEquals(-1.0, calculator.add(-2, 1), "-2 + 1 = -1");
        assertEquals(0.0, calculator.add(-3, 3), "-3 + 3 = 0");

        assertEquals(Double.MAX_VALUE, calculator.add(Double.MAX_VALUE, 0), "MAX_VALUE + 0 = MAX_VALUE");
        assertThrows(ArithmeticException.class, () -> calculator.add(Double.MAX_VALUE, Double.MAX_VALUE),
                "Addition of two MAX_VALUE numbers should cause overflow");

        assertEquals(Double.MIN_VALUE, calculator.add(Double.MIN_VALUE, 0), "MIN_VALUE + 0 = MIN_VALUE");
        assertEquals(0.0, calculator.add(-Double.MIN_VALUE, Double.MIN_VALUE), "Adding MIN_VALUE and -MIN_VALUE should be 0");
    }

    @Test
    void testSubtraction() {
        assertEquals(1.0, calculator.subtract(3, 2), "3 - 2 = 1");
        assertEquals(-3.0, calculator.subtract(-2, 1), "-2 - 1 = -3");
        assertEquals(1.0, calculator.subtract(1, 0), "1 - 0 = 1");

        assertEquals(Double.MAX_VALUE, calculator.subtract(Double.MAX_VALUE, 0), "MAX_VALUE - 0 = MAX_VALUE");
        assertEquals(0.0, calculator.subtract(Double.MAX_VALUE, Double.MAX_VALUE), "MAX_VALUE - MAX_VALUE = 0");

        assertEquals(Double.MIN_VALUE, calculator.subtract(Double.MIN_VALUE, 0), "MIN_VALUE - 0 = MIN_VALUE");
        assertEquals(-Double.MIN_VALUE, calculator.subtract(0, Double.MIN_VALUE), "0 - MIN_VALUE = -MIN_VALUE");
    }

    @Test
    void testMultiplication() {
        assertEquals(6.0, calculator.multiply(2, 3), "2 * 3 = 6");
        assertEquals(-2.0, calculator.multiply(-2, 1), "-2 * 1 = -2");
        assertEquals(4.0, calculator.multiply(-2, -2), "-2 * -2 = 4");
        assertEquals(0.0, calculator.multiply(0, 5), "0 * 5 = 0");

        assertThrows(ArithmeticException.class, () -> calculator.multiply(Double.MAX_VALUE, 2),
                "Multiplying MAX_VALUE by 2 should cause overflow");

        assertEquals(0.0, calculator.multiply(Double.MIN_VALUE, 0), "MIN_VALUE * 0 = 0");
        assertEquals(Double.MIN_VALUE, calculator.multiply(Double.MIN_VALUE, 1), "MIN_VALUE * 1 = MIN_VALUE");
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.divide(6, 3), "6 / 3 = 2");
        assertEquals(-2.0, calculator.divide(-6, 3), "-6 / 3 = -2");
        assertEquals(1.0, calculator.divide(-6, -6), "-6 / -6 = 1");

        Exception e = assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
        assertEquals("Division by zero!", e.getMessage());

        assertEquals(Double.MAX_VALUE / 2, calculator.divide(Double.MAX_VALUE, 2), "MAX_VALUE / 2 should not overflow");

        assertEquals(1.0, calculator.divide(Double.MIN_VALUE, Double.MIN_VALUE), "MIN_VALUE / MIN_VALUE = 1");
        assertEquals(0.0, calculator.divide(0, Double.MIN_VALUE), "0 / MIN_VALUE = 0");
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 2",
            "0, 0, 0",
            "-1, -1, -2",
            "1.5, 2.5, 4.0",
            "-1.5, 1.5, 0.0"
    })
    void testParameterizedAddition(double a, double b, double res) {
        assertEquals(res, calculator.add(a, b), "addition failed for " + a + " and" + b);
    }

    @ParameterizedTest
    @CsvSource({
            "6, 3, 2",
            "10, 5, 2",
            "-10, -2, 5",
            "1.5, 0.5, 3.0"
    })
    void testParameterizedDivision(double a, double b, double res) {
        assertEquals(res, calculator.divide(a, b), "Division failed for " + a + " and " + b);
    }

    @Test
    void failingTest() {
        assertEquals(5.0, calculator.add(2, 2), "Failed Test");
    }
}
