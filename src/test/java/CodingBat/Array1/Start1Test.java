package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class Start1Test {
    @Test
    public void sampleTest() {
        Start1 s1 = new Start1();
        Assert.assertEquals(1, s1.start1(new int[]{1,2,3}, new int[]{}));
        Assert.assertEquals(2, s1.start1(new int[]{1,2,3}, new int[]{1}));
        Assert.assertEquals(2, s1.start1(new int[]{1,2,3}, new int[]{1,3,4}));
        Assert.assertEquals(1, s1.start1(new int[]{8,2,3}, new int[]{1,3,4}));
        Assert.assertEquals(0, s1.start1(new int[]{8,2,3}, new int[]{6,3,4}));
    }
    @Test
    public void rightPosTest() {
        Start1 s1 = new Start1();
        Assert.assertEquals(1, s1.start1(new int[]{1,2,3}, new int[]{}));
    }

    @Test
    public void leftPosTest() {
        Start1 s1 = new Start1();
        Assert.assertEquals(1, s1.start1(new int[]{}, new int[]{1,2,3}));
    }

    @Test
    public void emptyTest() {
        Start1 s1 = new Start1();
        Assert.assertEquals(0, s1.start1(new int[]{}, new int[]{}));
    }
}
