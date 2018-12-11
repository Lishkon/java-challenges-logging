package HackerRank.CodingDays30;

import java.util.Arrays;
import java.util.Scanner;

public class Day06 {
    /* Given a string, S , of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed
     * characters as  space-separated strings on a single line (see the Sample below for more detail).
     * Note:  is considered to be an even index.
     * */

    public static void main(String[] args) {
        /*
         * 1. Take the int input
         * 2. Take the String input
         * 3. Print it's even-indexed characters and odd-indexed characters separated by space
         * 5. Repeat while < int
         * */
        Scanner sc = new Scanner(System.in);

        String input;
        int count = sc.nextInt();
        sc.nextLine();



        for (int i = 0; i<count; i++) {
            String even = "";
            String odds = "";
            input = sc.nextLine();
            String[] inArr = input.split("");

            for (int j = 0; j < inArr.length; j++) {

                if (j%2==0) {
                    even += inArr[j];
                }
                if (j%2!=0) {
                    odds += inArr[j];
                }

            }
            System.out.println(even + " " + odds);
        }

    }
}
