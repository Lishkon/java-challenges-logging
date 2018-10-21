package kyu8;

public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {

        return (isEven(flower1)&& isOdd(flower2) || isOdd(flower1)&&isEven(flower2))? true : false;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    // Actually, it would be enough just simply return x%2!=y%2;

}

