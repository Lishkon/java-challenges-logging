package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class No23Test {
    @Test
    public void test() {
        No23 n2 = new No23();
        Assert.assertTrue(n2.no23(new int[] {4,5}));
    }

    @Test
    public void secondTest() {
        No23 n2 = new No23();
        Assert.assertFalse(n2.no23(new int[] {4,2}));
    }
}
