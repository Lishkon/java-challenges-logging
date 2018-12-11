package HackerRank.ProblemSolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArraysDS {
    private static int[] reverseArray(int[] a) {
//        int[] revArr = new int[a.length];
//        for (int i = 0; i < a.length; i++){
//            for (int j = a.length-1; j>0; j--) {
//                revArr[i] = a[j];
//
//            }
//        }
//
//        return revArr;
        for(int i=a.length-1, j=0; i!=j && i>j; i--, j++) {
            int temp = a[j];
            a[j]=a[i];
            a[i]=temp;
        }

        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Seems like this is the number that determines the array length
        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // Initializing an empty array, with N allocated labels (determined by arrCount num)
        int[] arr = new int[arrCount];

        // Filling out the array with String values
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // Converting the string values into Integers and pushing them to arr
        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        // Using a reverseArray function to reverse the array elements
        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
