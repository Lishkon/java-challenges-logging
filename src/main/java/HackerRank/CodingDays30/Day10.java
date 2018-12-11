package HackerRank.CodingDays30;

import java.util.Scanner;

public class Day10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String binN = Integer.toBinaryString(n);
//        String[] binC = binN.split("");
//        int num  = 1;
//        for (int i = 0; i<binC.length-1; i++) {
//            if (binC[i].equals("1") && binC[i+1].equals("1")) {
//                num++;
//                break;
//            }
//        }
//        System.out.println(num);
        int rem=0,s=0,t=0;


        while(n>0)
        {
            rem=n%2;
            n=n/2;
            if(rem==1)
            {   s++;
                if(s>=t)

                    t=s;

            }
            else{

                s=0;
            }
        }

        System.out.println(t);
        scanner.close();
    }
}
