package CodingBat.String01Test;

import CodingBat.String01.WithoutEnd;
import org.junit.Assert;
import org.junit.Test;

public class WithoutEndTest {
    @Test
    public void helloTest() {
        WithoutEnd we = new WithoutEnd();
        Assert.assertEquals("ell", we.withoutEnd("Hello"));
    }

    @Test
    public void javaTest() {
        WithoutEnd we = new WithoutEnd();
        Assert.assertEquals("av", we.withoutEnd("java"));
    }

    @Test
    public void codingTest() {
        WithoutEnd we = new WithoutEnd();
        Assert.assertEquals("odin", we.withoutEnd("coding"));
    }

    @Test
    public void hiTest() {
        WithoutEnd we = new WithoutEnd();
        Assert.assertEquals("", we.withoutEnd("hi"));
    }
}
