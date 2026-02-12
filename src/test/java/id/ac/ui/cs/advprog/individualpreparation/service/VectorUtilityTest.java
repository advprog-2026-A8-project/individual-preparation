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
}
