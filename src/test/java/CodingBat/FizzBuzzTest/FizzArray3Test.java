package CodingBat.FizzBuzzTest;

import CodingBat.FizzBuzzCode.FizzArray3;
import org.junit.Assert;
import org.junit.Test;

public class FizzArray3Test {
    @Test
    public void twoItemsArrayTest() {
        FizzArray3 fa = new FizzArray3();
        Assert.assertArrayEquals(new int[]{1,2}, fa.fizzArray3(1,3));
    }

    @Test
    public void fiveItemsArrayTest() {
        FizzArray3 fa = new FizzArray3();
        Assert.assertArrayEquals(new int[]{5, 6, 7, 8, 9}, fa.fizzArray3(5,10));
    }

    @Test
    public void sevenItemsArrayTest() {
        FizzArray3 fa = new FizzArray3();
        Assert.assertArrayEquals(new int[]{11, 12, 13, 14, 15, 16, 17}, fa.fizzArray3(11,18));
    }
}
