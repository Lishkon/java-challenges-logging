package CodingBat.String01Test;

import CodingBat.String01.MinCat;
import org.junit.Assert;
import org.junit.Test;

public class MinCatTest {

    /*
     * minCat("Hello", "Hi") → "loHi"
     * minCat("Hello", "java") → "ellojava"
     * minCat("java", "Hello") → "javaello"
     * */

    @Test
    public void sampleTest() {
        MinCat mc = new MinCat();
        Assert.assertEquals("loHi", mc.minCat("Hello", "Hi"));
        Assert.assertEquals("ellojava", mc.minCat("Hello", "java"));
        Assert.assertEquals("javaello", mc.minCat("java", "hello"));
    }

    @Test
    public void equalTest() {
        MinCat mc = new MinCat();
        Assert.assertEquals("HeHi", mc.minCat("He", "Hi"));
    }
}
