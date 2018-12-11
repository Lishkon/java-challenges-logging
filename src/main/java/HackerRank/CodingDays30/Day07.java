package HackerRank.CodingDays30;

import java.util.Scanner;

public class Day07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] countArr = new int[count];

        for (int i = 0; i < count; i++) {
            countArr[i] = sc.nextInt();
        }

        // Not the best way, but it works!!!
        for(int i = countArr.length-1, j=0; i!=j && i>j; i--, j++) {
            int temp = countArr[j];
            countArr[j]=countArr[i];
            countArr[i]=temp;
        }
        String output = "";
        for (int i : countArr) {
            output += i + " ";
        }

        System.out.println(output);
    }
}
