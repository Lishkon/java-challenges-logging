package HackerRank.CodingDays30;

import java.util.Scanner;

public class Day03 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        // If N is odd, print Weird
        if (N % 2 != 0) {
            System.out.println("Weird");
        }

        // If N is even, and in the inclusive range of 2 to 5, print Not Weird
        if (N % 2 == 0 && (N >= 2 && N <= 5)) {
            System.out.println("Not Weird");
        }

        // If N is even, and in the inclusive range of 6 to 20, print Not Weird
        if (N % 2 == 0 && (N >= 6 && N <= 20)) {
            System.out.println("Weird");
        }

        // If N is even and greater than 20, print Not Weird
        if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        }

    }
}
