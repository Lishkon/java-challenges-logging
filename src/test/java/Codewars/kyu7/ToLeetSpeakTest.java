package Codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToLeetSpeakTest {
    @Test
    public void simpleCodewarsTest() {
        assertEquals("(0D3W@R$", ToLeetSpeak.toLeetSpeak("CODEWARS"));
    }

    @Test
    public void simpleLeetTest(){
        assertEquals("1337", ToLeetSpeak.toLeetSpeak("LEET"));
    }

    @Test
    public void simpleHelloWorldTest(){
        assertEquals("#3110 W0R1D", ToLeetSpeak.toLeetSpeak("HELLO WORLD"));
    }

    @Test
    public void simpleLoremTest() {
        assertEquals("10R3M !P$UM D010R $!7 @M37", ToLeetSpeak.toLeetSpeak("LOREM IPSUM DOLOR SIT AMET"));
    }

    @Test
    public void simpleRandomLongStringTest() {
        assertEquals("7#3 QU!(K 8R0WN F0X JUMP$ 0V3R 7#3 1@2Y D06", ToLeetSpeak.toLeetSpeak("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
    }
}
