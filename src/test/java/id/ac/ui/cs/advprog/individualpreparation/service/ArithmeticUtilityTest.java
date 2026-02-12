package id.ac.ui.cs.advprog.individualpreparation.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {

    private final ArithmeticUtility utility = new ArithmeticUtility();

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
}
