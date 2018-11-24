package CodingBat.FizzBuzzTest;

import CodingBat.FizzBuzzCode.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void simpleTest() {
        FizzBuzz fb = new FizzBuzz();
        Assert.assertArrayEquals(new String[]{"1", "2"}, fb.fizzBuzz(1,3));
    }

    @Test
    public void oneThroughFourTest() {
        FizzBuzz fb = new FizzBuzz();
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz"}, fb.fizzBuzz(1,4));
    }

    @Test
    public void oneThroughSixTest() {
        FizzBuzz fb = new FizzBuzz();
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, fb.fizzBuzz(1,6));
    }

    @Test
    public void oneThroughEightTest() {
        FizzBuzz fb = new FizzBuzz();
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, fb.fizzBuzz(1,8));
    }

    @Test
    public void oneThroughSixteenTest() {
        FizzBuzz fb = new FizzBuzz();
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, fb.fizzBuzz(1,16));
    }
}
