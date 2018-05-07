package kyu8;

/**
 * See the url to the kata: https://www.codewars.com/kata/reversed-sequence/train/java
 * */
import java.util.stream.IntStream;

public class ReversedSequence {
    public static int[] reverse(int n) {
        int[] result = IntStream.rangeClosed(1, n).toArray();
        for(int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[result.length-i-1];
            result[result.length-i-1] = temp;
        }

        return result;
    }
}

/*
* Better solution:
*
* public static int[] reverse(int n) {
*   return IntStream.range(-n, 0).map(Math::abs).toArray();
* }
*/