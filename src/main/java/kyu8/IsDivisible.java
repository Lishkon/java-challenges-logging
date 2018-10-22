package kyu8;

public class IsDivisible {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0 ? true : false;
    }
}
