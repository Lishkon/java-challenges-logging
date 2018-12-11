package HackerRank.Strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] inpArr = inp.split("");
        String inpRev = "";
        for (int i = 0; i<inpArr.length/2; i++ ) {
            String temp = inpArr[i];
            inpArr[i] = inpArr[inpArr.length - i - 1];
            inpArr[inpArr.length - i - 1] = temp;
        }
        for (String s : inpArr) {
            inpRev+=s;
        }
        if (inp.equals(inpRev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
