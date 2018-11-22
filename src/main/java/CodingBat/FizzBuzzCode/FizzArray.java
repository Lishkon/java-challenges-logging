package CodingBat.FizzBuzzCode;

public class FizzArray {
    public int[] fizzArray (int n) {
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = i;
        }
        return output;
    }
}
