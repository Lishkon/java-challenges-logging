package CodingBat.FizzBuzzCode;

public class FizzString2 {
    public String fizzString2(int n) {
        String output;
        if ( n % 3 == 0 && n % 5 != 0) output = "Fizz!";
        else if ( n % 5 == 0 && n % 3 != 0) output = "Buzz!";
        else if ( n % 3 == 0 && n % 5 == 0) output = "FizzBuzz!";
        else output = n + "!";
        return output;
    }
}
