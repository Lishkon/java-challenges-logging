package kyu8;

import java.util.Arrays;

public class Maps {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x * 2).toArray();
    }


}
