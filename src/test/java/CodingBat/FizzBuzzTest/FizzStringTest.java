package CodingBat.FizzBuzzTest;

import CodingBat.FizzBuzzCode.FizzString;
import org.junit.Assert;
import org.junit.Test;

public class FizzStringTest {
    FizzString fs = new FizzString();
    @Test
    public void fizzTest() {
        Assert.assertEquals("Fizz", fs.fizzString("fig"));
    }

    @Test
    public void buzzTest() {
        Assert.assertEquals("Buzz", fs.fizzString("dib"));
    }

    @Test
    public void fizzBuzzTest() {
        Assert.assertEquals("FizzBuzz", fs.fizzString("fib"));
    }

    @Test
    public void unchangedTest() {
        Assert.assertEquals("abc", fs.fizzString("abc"));
    }

    @Test
    public void boooTest() {
        Assert.assertEquals("booo", fs.fizzString("booo"));
    }

    @Test
    public void HelloTest() {
        Assert.assertEquals("Hello", fs.fizzString("Hello"));
    }

    @Test
    public void afTest() {
        Assert.assertEquals("af", fs.fizzString("af"));
    }
}
