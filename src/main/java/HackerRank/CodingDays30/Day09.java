package HackerRank.CodingDays30;

import java.util.Scanner;

public class Day09 {
    /*
    * Write a factorial function that takes a positive integer, N as a parameter and prints the result of N!(N factorial).
    * Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score
    *
    * Input format:
    * A single integer, N (the argument to pass to factorial).
    *
    * Constraints
    * - 2 <= N <= 12
    * - Your submission must contain a recursive function named factorial.
    * */
    public static int factorial(int n) {
        while (n>=2 && n <=12) {
            return n * factorial(n-1);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
