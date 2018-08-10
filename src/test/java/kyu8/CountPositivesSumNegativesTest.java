package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CountPositivesSumNegativesTest {

    @Test
    public void countPositivesSumNegatives_BasicTest() {
        int[] expected = new int[]{10, -65};
        assertArrayEquals(expected, CountPositivesSumNegatives.countPositiveSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }

    @Test
    public void countPositivesSumNegatives_InputWithZeroes() {
        int[] expected = new int[]{8, -50};
        assertArrayEquals(expected, CountPositivesSumNegatives.countPositiveSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }

    @Test
    public void countPositivesSumNegatives_InputWithEmptyValues() {
        int[] expected = new int[0];
        assertArrayEquals(expected, CountPositivesSumNegatives.countPositiveSumNegatives(new int[0]));
    }

    @Test
    public void countPositivesSumNegatives_InputWithNullValues() {
        int[] expected = new int[0];
        assertArrayEquals(expected, CountPositivesSumNegatives.countPositiveSumNegatives(null));
    }
}
