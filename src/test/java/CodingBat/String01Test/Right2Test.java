package CodingBat.String01Test;

import org.junit.Assert;
import org.junit.Test;

public class Right2Test {
    @Test
    public void helloTest() {
        Right2 r2 = new Right2();
        Assert.assertEquals("loHel", r2.right2("Hello"));
    }

    @Test
    public void javaTest() {
        Right2 r2 = new Right2();
        Assert.assertEquals("vaja", r2.right2("java"));
    }

    @Test
    public void hiTest() {
        Right2 r2 = new Right2();
        Assert.assertEquals("Hi", r2.right2("Hi"));
    }
}
