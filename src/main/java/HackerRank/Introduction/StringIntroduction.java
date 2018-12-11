package HackerRank.Introduction;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {

        /*
         *  [ ] For the first line, sum the lengths of A and B.
         *  [ ] For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
         *  [ ] For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
         * */
        Scanner sc =new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println((A + B).length());
        boolean compared = A.compareTo(B) > B.compareTo(A);
        System.out.println(compared ? "Yes" : "No");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));



    }
}
