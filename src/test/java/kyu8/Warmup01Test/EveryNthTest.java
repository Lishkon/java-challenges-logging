package kyu8.Warmup01Test;

import kyu8.Warmup01.EveryNth;
import org.junit.Assert;
import org.junit.Test;

public class EveryNthTest {

    @Test
    public void simpleTest(){
        Assert.assertEquals( "Mrce", EveryNth.everyNth("Miracle", 2));
    }

    @Test
    public void randomTest(){
        Assert.assertEquals("aceg", EveryNth.everyNth("abcdefg", 2));
    }

    @Test
    public void AnotherRandomTest(){
        Assert.assertEquals("adg", EveryNth.everyNth("abcdefg", 3));
    }
}
