package HackerRank.CodingDays30;

import java.util.Arrays;
import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements){
        this.elements=elements;
    }

    int computeDifference() {
        Arrays.sort(elements);
        if (elements.length>1) {
            maximumDifference = elements[elements.length-1]-elements[0];
        }
        return maximumDifference;
    }


}

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
