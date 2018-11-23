package CodingBat.FizzBuzzTest;

import CodingBat.FizzBuzzCode.FizzArray2;
import org.junit.Assert;
import org.junit.Test;

public class FizzArray2Test {
    @Test
    public void arrayTwoTest() {
        FizzArray2 fa = new FizzArray2();
        String[] expected = {"0", "1"};
        Assert.assertArrayEquals(expected, fa.fizzArray2(2));
    }

    @Test
    public void arrayFourTest() {
        FizzArray2 fa = new FizzArray2();
        String[] expected = {"0", "1", "2", "3"};
        Assert.assertArrayEquals(expected, fa.fizzArray2(4));
    }

    @Test
    public void arrayTenTest() {
        FizzArray2 fa = new FizzArray2();
        String[] expected = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Assert.assertArrayEquals(expected, fa.fizzArray2(10));
    }
}
