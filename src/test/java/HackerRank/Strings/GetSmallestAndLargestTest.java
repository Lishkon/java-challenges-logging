package HackerRank.Strings;

import org.junit.Assert;
import org.junit.Test;

public class GetSmallestAndLargestTest {
    @Test
    public void sampleTest() {
        GetSmallestAndLargest gsal = new GetSmallestAndLargest();
        Assert.assertEquals("ava/nwel",gsal.getSmallestAndLargest("welcometojava",3));
    }
}
