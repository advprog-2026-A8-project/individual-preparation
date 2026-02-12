package id.ac.ui.cs.advprog.individualpreparation.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorUtilityTest {

    private final VectorUtility utility = new VectorUtility();

    @Test
    void testAdd() {
        double[] result = utility.add(new double[]{1,2,3},new double[]{4,5,6});
        assertArrayEquals(new double[]{5,7,9},result);
    }

    @Test
    void testSubtractNormalCase() {
        double[] v1 = {5.0, 7.0, 9.0};
        double[] v2 = {1.0, 2.0, 3.0};
        double[] result = utility.subtract(v1, v2);
        assertArrayEquals(new double[]{4.0, 5.0, 6.0}, result);
    }

    @Test
    void testSubtractWithNegativeNumbers() {
        double[] v1 = {-2.0, -3.0};
        double[] v2 = {7.0, 8.0};
        double[] result = utility.subtract(v1, v2);
        assertArrayEquals(new double[]{-9.0, -11.0}, result);
    }

    @Test
    void testSubtractDifferentLength() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            utility.subtract(v1, v2);
        });
        assertEquals("Vector lengths must be equal", exception.getMessage());
    }
}
