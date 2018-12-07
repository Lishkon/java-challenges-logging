package HackerRank.Strings;

import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext()) {
            System.out.print("0");
            return;
        }

        String s = scan.nextLine();
        String[] items = s.trim().split("[ !,?.\\_'@]+");

        if(s.length() == 0){
            System.out.println("0");
        }
        else if(s.length() > 400000){
            return;
        }
        else{
            System.out.println(items.length);
        }

        for(String item: items){
            System.out.println(item);
        }
        scan.close();
    }
}
