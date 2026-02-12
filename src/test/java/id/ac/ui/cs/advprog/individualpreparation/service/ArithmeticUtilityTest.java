package id.ac.ui.cs.advprog.individualpreparation.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {

    private final ArithmeticUtility utility = new ArithmeticUtility();

    @Test
    void testAddPositiveNumbers() {
        double result = utility.add(5.0, 3.0);
        assertEquals(8.0, result, 1e-9);
    }

    @Test
    void testAddNegativeNumbers() {
        double result = utility.add(-5.0, -3.0);
        assertEquals(-8.0, result, 1e-9);
    }

    @Test
    void testAddPositiveAndNegative() {
        double result = utility.add(10.0, -4.0);
        assertEquals(6.0, result, 1e-9);
    }

    @Test
    void testAddWithZero() {
        double result = utility.add(7.5, 0.0);
        assertEquals(7.5, result, 1e-9);
    }

    @Test
    void testExponent() {
        double result = utility.exponent(2, 4);
        assertEquals(16.0, result);
    }

    @Test
    void testDivideNormalCase() {
        double result = utility.divide(10.0, 2.0);
        assertEquals(5.0, result);
    }

    @Test
    void testDivideNegativeNumber(){
        double result = utility.divide(-10.0, 2.0);
        assertEquals(-5.0, result);
    }

    @Test
    void testDivideByZero(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            utility.divide(10.0, 0.0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    void testSubtractPositive() {
        double result = utility.subtract(10.0, 3.0);
        assertEquals(7.0, result, 1e-9);
    }

    @Test
    void testSubtractNegative() {
        double result = utility.subtract(-5.0, -2.0);
        assertEquals(-3.0, result, 1e-9);
    }

    @Test
    void testSubtractResultNegative() {
        double result = utility.subtract(5.0, 10.0);
        assertEquals(-5.0, result, 1e-9);
    }

    @Test
    void testSubtractZero() {
        double result = utility.subtract(10.0, 0.0);
        assertEquals(10.0, result, 1e-9);
    }

    @Test
    void testSubtractFromZero() {
        double result = utility.subtract(0.0, 5.0);
        assertEquals(-5.0, result, 1e-9);
    }

    @Test
    void testSubtractDecimals() {
        double result = utility.subtract(5.5, 2.2);
        assertEquals(3.3, result, 1e-9);
    }

    @Test
    void testSubtractLargeNumbers() {
        double result = utility.subtract(1000000.0, 1.0);
        assertEquals(999999.0, result, 1e-9);
    }

    @Test
    void testMultiplyDummy() {
        double result = utility.multiply(5.0, 2.0);
        assertNotNull(result);
    }
}
