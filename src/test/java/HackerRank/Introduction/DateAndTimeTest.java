package HackerRank.Introduction;

import org.junit.Assert;
import org.junit.Test;

public class DateAndTimeTest {
    @Test
    public void sampleTest() {
        DateAndTime dat = new DateAndTime();
        Assert.assertEquals("WEDNESDAY", dat.findDay(8, 5, 2015));
    }
}
