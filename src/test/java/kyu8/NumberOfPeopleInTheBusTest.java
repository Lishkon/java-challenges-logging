package kyu8;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumberOfPeopleInTheBusTest {
    NumberOfPeopleInTheBus number = new NumberOfPeopleInTheBus();

    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10,0});
        list.add(new int[]{3,5});
        list.add(new int[]{2,5});

        assertEquals(5, number.countPassengers(list));
    }
}
