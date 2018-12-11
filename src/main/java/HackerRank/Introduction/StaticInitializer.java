package HackerRank.Introduction;

import java.util.Scanner;

public class StaticInitializer{

    private static boolean flag = true;
    private static int B;
    private static int H;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) throws Exception{
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}
