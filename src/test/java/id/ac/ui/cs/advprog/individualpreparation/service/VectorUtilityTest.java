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

    @Test
    void testMultiplyNormal(){
        double[] v1 = {1.0, 2.0, 3.0};
        double[] result = utility.multiply(v1, 2);
        assertArrayEquals(new double[]{2.0, 4.0, 6.0}, result);
    }

    @Test
    void testMultiplyWithSameResult(){
        double[] v1 = {1.0, 2.0, 3.0};
        double[] result = utility.multiply(v1, 1);
        assertArrayEquals(result, result);
    }

    @Test
    void testMultiplyWithNegativeValues(){
        double[] v1 = {-1.0, 2.0, -3.0};
        double[] result = utility.multiply(v1, 2);
        assertArrayEquals(new double[]{-2.0, 4.0, -6.0}, result);
    }

    @Test
    void testMultiplyWithNegativeScalar() {
        double[] v1 = {1.0, -2.0, 3.0};
        double[] result = utility.multiply(v1, -3);
        assertArrayEquals(new double[]{-3.0, 6.0, -9.0}, result);
    }

    @Test
    void testNormNormalCase() {
        double[] v = {3.0, 4.0};
        double result = utility.norm(v);
        assertEquals(5.0, result, 1e-9);
    }

    @Test
    void testNormWithNegativeNumbers() {
        double[] v = {-3.0, -4.0};
        double result = utility.norm(v);
        assertEquals(5.0, result, 1e-9);
    }

    @Test
    void testNormSingleElement() {
        double[] v = {7.0};
        double result = utility.norm(v);
        assertEquals(7.0, result, 1e-9);
    }

    @Test
    void testNormNullVector() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            utility.norm(null);
        });
        assertEquals("Vector cannot be null", exception.getMessage());
    }

    @Test
    void testNormEmptyVector() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            utility.norm(new double[]{});
        });
        assertEquals("Vector cannot be empty", exception.getMessage());
    }

    @Test
    void testDotProductNormal() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};
        double result = utility.dotProduct(v1, v2);
        assertEquals(32.0, result, 1e-9);
    }

    @Test
    void testDotProductWithNegative() {
        double[] v1 = {-1.0, -2.0};
        double[] v2 = {3.0, -4.0};
        double result = utility.dotProduct(v1, v2);
        assertEquals(5.0, result, 1e-9);
    }

    @Test
    void testDotProductDifferentLength() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            utility.dotProduct(v1, v2);
        });
        assertEquals("Vector lengths must be equal", exception.getMessage());
    }

}
