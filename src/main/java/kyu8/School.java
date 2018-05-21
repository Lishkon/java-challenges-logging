package kyu8;

public class School {
    /**
     * This method returns the average of the array values
     * @param marks int[]
     * @return average of the marks array elements
     * */
    public static int getAverage(int[] marks) {


        int arraySum = 0;
        int arraySize = marks.length;
        for (int n : marks) {
            arraySum += n;
        }
        return arraySum / arraySize;
    }
}
