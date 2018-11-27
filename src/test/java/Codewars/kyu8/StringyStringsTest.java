package Codewars.kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class StringyStringsTest {
    @Test
    public void startTest() {
        assertEquals("Your string should start with a 1", '1', StringyStrings.stringy(3).charAt(0));
    }

    @Test
    public void lengthTests() {
        Random randGen = new Random();
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
            assertEquals("Wrong length using size " + size, size, StringyStrings.stringy(size).length());
        }
    }

    @Test
    public void sixCharLongTest() {
        assertEquals("101010", StringyStrings.stringy(6));
    }

    @Test
    public void fourCharsLongTest() {
        assertEquals("1010", StringyStrings.stringy(4));
    }

    @Test
    public void twelveCharsLongTest() {
        assertEquals("101010101010", StringyStrings.stringy(12));
    }


}
