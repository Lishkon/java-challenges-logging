package Codesignal;

import org.junit.Assert;
import org.junit.Test;

public class MakeArrayConsecutive2Test {
    @Test
    public void test() {
        MakeArrayConsecutive2 mac = new MakeArrayConsecutive2();
        Assert.assertEquals(3, mac.makeArrayConsecutive2(new int[]{6,2,3,8}));
    }

    @Test
    public void simpleTest() {
        MakeArrayConsecutive2 mac = new MakeArrayConsecutive2();
        Assert.assertEquals(2, mac.makeArrayConsecutive2(new int[]{0,3}));
    }

    @Test
    public void oneMoreSimpleTest() {
        MakeArrayConsecutive2 mac = new MakeArrayConsecutive2();
        Assert.assertEquals(2, mac.makeArrayConsecutive2(new int[]{6,3}));
    }

    @Test
    public void oneItemTest() {
        MakeArrayConsecutive2 mac = new MakeArrayConsecutive2();
        Assert.assertEquals(0, mac.makeArrayConsecutive2(new int[]{1}));
    }
}
