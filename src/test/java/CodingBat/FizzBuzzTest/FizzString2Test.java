package CodingBat.FizzBuzzTest;

import CodingBat.FizzBuzzCode.FizzString2;
import org.junit.Assert;
import org.junit.Test;

public class FizzString2Test {
    @Test
    public void oneTest() {
        FizzString2 fs = new FizzString2();
        Assert.assertEquals("1!",fs.fizzString2(1));
    }

    @Test
    public void twoTest() {
        FizzString2 fs = new FizzString2();
        Assert.assertEquals("2!",fs.fizzString2(2));
    }

    @Test
    public void threeTest() {
        FizzString2 fs = new FizzString2();
        Assert.assertEquals("Fizz!",fs.fizzString2(3));
    }

    @Test
    public void fifteenTest() {
        FizzString2 fs = new FizzString2();
        Assert.assertEquals("FizzBuzz!",fs.fizzString2(15));
    }

}
