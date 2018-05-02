package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestIntegerInTheArrayTest {
    @Test
    public void testOne(){
        int expected = 0;
        int actual = SmallestIntegerInTheArray.findSmallestInt(new int[]{1,2,0});
        assertEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        int expected = 0;
        int actual = SmallestIntegerInTheArray.findSmallestInt(new int[]{1,2,0,0,0,3,8888});
        assertEquals(expected, actual);
    }

    @Test
    public void testThree(){
        int expected = 1;
        int actual = SmallestIntegerInTheArray.findSmallestInt(new int[]{7,8,10,5,32,1});
        assertEquals(expected, actual);
    }

    @Test
    public void testFour(){
        int expected = -5;
        int actual = SmallestIntegerInTheArray.findSmallestInt(new int[]{-1,-2,-3,-4,-5});
        assertEquals(expected, actual);
    }

    @Test
    public void testFive(){
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerInTheArray.findSmallestInt(new int[]{0,1,2,987, Integer.MIN_VALUE});
        assertEquals(expected, actual);
    }

    @Test
    public void testSix(){
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerInTheArray.findSmallestInt(new int[]{890,333,234,33,0, Integer.MIN_VALUE});
        assertEquals(expected, actual);
    }

    @Test
    public void randomVals(){
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerInTheArray.findSmallestInt(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE});
        assertEquals(expected, actual);
    }
}
