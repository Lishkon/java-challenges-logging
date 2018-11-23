package CodingBat.FizzBuzzCode;

public class FizzArray2 {
    public String[] fizzArray2(int n) {
        String[] output = new String[n];
        for (int i = 0; i<n; i++){
            output[i] = "" + i;
        }
        return output;
    }
}
