package Codewars.kyu8;

/**
 * Public on https://www.codewars.com/kata/58f0ba42e89aa6158400000e/train/java
 * */

public class PaperFolder {
//    public static void main(String[] args) {
//        fold(1.0);
//    }

    public static long fold(Double distance) {
        double thickness = 0.0001 * 10 * 10 * 10;
        double foldedMeter = 100 / thickness;
        long absoluteDistance = (long) (foldedMeter * (new Double(foldedMeter).longValue()));

        //System.out.println(thickness + " " + foldedMeter);
        return absoluteDistance;
    }
}
