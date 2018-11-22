package CodingBat.FizzBuzzTest;

import CodingBat.FizzBuzzCode.FizzArray;
import org.junit.Assert;
import org.junit.Test;

public class FizzArrayTest {
    @Test
    public void zeroTest() {
        FizzArray fa = new FizzArray();
        Assert.assertArrayEquals(new int[]{0}, fa.fizzArray(1));
    }

    @Test
    public void fourTest() {
        FizzArray fa = new FizzArray();
        Assert.assertArrayEquals(new int[]{0,1,2,3}, fa.fizzArray(4));
    }

    @Test
    public void tenTest() {
        FizzArray fa = new FizzArray();
        Assert.assertArrayEquals(new int[]{0,1,2,3,4,5,6,7,8,9}, fa.fizzArray(10));
    }

}
