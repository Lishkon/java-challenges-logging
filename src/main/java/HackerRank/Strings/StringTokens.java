package HackerRank.Strings;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] sArr = s.split("[!,?_' @]+");
        System.out.println(sArr.length);
        for (String str: sArr) {
            System.out.println(str);
        }
    }
}
