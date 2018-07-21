package kyu8;

import org.junit.Test;

import static kyu8.ConvertBooleanToString.convertToString;
import static org.junit.Assert.assertEquals;

public class ConvertBooleanToStringTest {
    @Test
    public void testTrue(){
        assertEquals("true", convertToString(true));

    }

    @Test
    public void testFalse(){
        assertEquals("false", convertToString(false));
    }
}
