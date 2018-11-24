package CodingBat.String01Test;

import CodingBat.String01.HelloName;
import org.junit.Assert;
import org.junit.Test;

public class HelloNameTest {
    @Test
    public void helloTest() {
        HelloName hn = new HelloName();
        Assert.assertEquals("Hello Bob!", hn.helloName("Bob"));
    }

    @Test
    public void AliceTest() {
        HelloName hn = new HelloName();
        Assert.assertEquals("Hello Alice!", hn.helloName("Alice"));
    }

    @Test
    public void XTest() {
        HelloName hn = new HelloName();
            Assert.assertEquals("Hello X!", hn.helloName("X"));
    }
}
