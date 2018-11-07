package SoloLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GapfulNumbers {
    public static boolean gapNum(int num) {

        String stringed = Integer.toString(num);
        String med = stringed.charAt(0) + "" + stringed.charAt(stringed.length()-1);
        int div = Integer.parseInt(med);
        return num % div == 0;
    }
//    public static void main(String[] args) {
//        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Type in your number to check:");
//        String input = "";
//        String gapable;
//
//        try {
//            input += userInput.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        int number = Integer.parseInt(input);
//        gapable = (gapNum(number)) ? "gapful" : "not gapful";
//        System.out.println("You entered " + number + " and it's " + gapable);
//    }
}
