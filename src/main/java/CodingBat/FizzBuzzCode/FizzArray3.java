package CodingBat.FizzBuzzCode;
/*
 * url - https://codingbat.com/prob/p142539?parent=/doc/practice/fizzbuzz-code.html
 **/

public class FizzArray3 {
    public int[] fizzArray3 (int start, int end) {
        int size = end-start;
        int[] output = new int[size];
        for (int i = 0; i < size; ){
            for (int j = start; j < end; j++) {
                output[i] = j;
                i++;
            }
        }
        return output;
    }
}
