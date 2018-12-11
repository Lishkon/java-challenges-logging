package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class FirstLast6Test {
    @Test
    public void oneTest() {
        FirstLast6 fl6 = new FirstLast6();
        Assert.assertTrue(fl6.firstLast6(new int[]{1,2,6}));
    }

    @Test
    public void threeTest() {
        FirstLast6 fl6 = new FirstLast6();
        Assert.assertTrue(fl6.firstLast6(new int[]{1,2,9,6}));
    }

    @Test
    public void fourTest() {
        FirstLast6 fl6 = new FirstLast6();
        Assert.assertFalse(fl6.firstLast6(new int[]{1,2,9,0}));
    }

    @Test
    public void fiveTest() {
        FirstLast6 fl6 = new FirstLast6();
        Assert.assertFalse(fl6.firstLast6(new int[]{1,2,9,0}));
    }

    @Test
    public void sixTest() {
        FirstLast6 fl6 = new FirstLast6();
        Assert.assertTrue(fl6.firstLast6(new int[]{6,2,9,6}));
    }

    @Test
    public void sevenTest() {
        FirstLast6 fl6 = new FirstLast6();
        Assert.assertTrue(fl6.firstLast6(new int[]{6}));
    }


}
