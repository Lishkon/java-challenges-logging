package CodingBat.Warmup02;

import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a numbers: Hour, Minute, Second: ");
        int fHour = sc.nextInt();
        int fMinute = sc.nextInt();
        int fSecond = sc.nextInt();

//        System.out.println("You entered: " + fHour + " hour(s), " + fMinute + " minute(s), " + fSecond + " second(s).");
//        System.out.println("Enter another moment's time: ");

        int sHour = sc.nextInt();
        int sMinute = sc.nextInt();
        int sSecond = sc.nextInt();

//        System.out.println("You entered: " + sHour + " hour(s), " + sMinute + " minute(s), " + sSecond + " second(s).");
        int initSecs = ((fHour * 60 + fMinute) * 60) + fSecond;
        int secSecs = ((sHour * 60 + sMinute) * 60) + sSecond;
        System.out.println("Here's the difference: " + (secSecs - initSecs));
    }
}

