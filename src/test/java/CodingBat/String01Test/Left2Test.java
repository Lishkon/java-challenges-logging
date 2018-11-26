package CodingBat.String01Test;

import CodingBat.String01.Left2;
import org.junit.Assert;
import org.junit.Test;

public class Left2Test {
    @Test
    public void helloTest() {
        Left2 l2 = new Left2();
        Assert.assertEquals("lloHe", l2.left2("Hello"));
    }

    @Test
    public void javaTest() {
        Left2 l2 = new Left2();
        Assert.assertEquals("vaja", l2.left2("java"));
    }

    @Test
    public void hiTest() {
        Left2 l2 = new Left2();
        Assert.assertEquals("Hi", l2.left2("Hi"));
    }
}
