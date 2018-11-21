package Codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CountingSheepTest {


    @Test
    public void testSomething() {
        //assertEquals("1 sheep...", CountingSheep.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", CountingSheep.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", CountingSheep.countingSheep(3));
    }

}
