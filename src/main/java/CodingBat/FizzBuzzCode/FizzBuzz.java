package CodingBat.FizzBuzzCode;

public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        int size = end-start;
        String[] output = new String[size];
        for (int i = start; i < end;) {

            for (int j = 0; j < size; j++) {
                if (i % 3 ==0 && (!(i % 5 == 0))) output[j]= "Fizz";
                else if ((!(i % 3 ==0)) && i % 5 == 0) output[j]= "Buzz";
                else if (i % 3 == 0 && i % 5 == 0) output[j]= "FizzBuzz";
                else output[j]= ""+ i;
                i++;
            }
        }
        return output;
    }
}
