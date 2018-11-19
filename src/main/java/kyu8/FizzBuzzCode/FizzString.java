package kyu8.FizzBuzzCode;

public class FizzString {
    public String fizzString(String str) {
        String result = "";
        if (str.charAt(0)=='f' && (!(str.charAt(str.length()-1) =='b'))) result += "Fizz";
        else if ((!(str.charAt(0)=='f')) && str.charAt(str.length()-1) =='b') result += "Buzz";
        else if (str.charAt(0)=='f' && (str.charAt(str.length()-1) =='b')) result += "FizzBuzz";
        else result = str;
        return result;
    }

    // The built-in str.startsWith(xxx) and str.endsWith(xxx) tests are very handy here.
}
