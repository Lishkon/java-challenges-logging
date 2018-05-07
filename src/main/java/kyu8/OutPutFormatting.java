package kyu8;

/**
 * https://www.hackerrank.com/challenges/java-output-formatting/problem
 * */

import java.util.Scanner;

public class OutPutFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String s1 = sc.next();
            int x = sc.nextInt();

            for(int j = 0; j < 15; j++){

                s1 = String.valueOf(new StringBuilder(s1).append(" "));

            }
            System.out.printf(s1 +  x + "\n");
        }

        System.out.println("================================");



    }

}
