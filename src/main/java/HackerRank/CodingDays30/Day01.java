package HackerRank.CodingDays30;

import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);


        int intIn = scan.nextInt();
        double doubIn = scan.nextDouble();
        scan.nextLine();
        String strIn = scan.nextLine();

        System.out.println(i + intIn);
        System.out.println(d + doubIn);
        System.out.println(s + strIn);
        scan.close();
    }
}
