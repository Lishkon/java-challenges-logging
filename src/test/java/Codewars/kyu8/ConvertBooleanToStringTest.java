package Codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertBooleanToStringTest {
    @Test
    public void testTrue(){
        Assert.assertEquals("true", ConvertBooleanToString.convertToString(true));

    }

    @Test
    public void testFalse(){
        Assert.assertEquals("false", ConvertBooleanToString.convertToString(false));
    }
}
