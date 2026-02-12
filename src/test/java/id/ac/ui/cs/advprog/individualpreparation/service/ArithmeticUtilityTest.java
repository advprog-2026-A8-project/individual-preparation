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
}
