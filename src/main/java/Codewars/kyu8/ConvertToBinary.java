package Codewars.kyu8;
/**
 * This class contains the <code>toBinary()</code> method that converts the regular number to a Binary one
 * */
public class ConvertToBinary {
    /**
     *  This method converts the regular number to <code>Binary</code> code
     *
     *  @param n which is the Integer type
     *  @return the converted Binary integer
     * */
    public static int toBinary(int n) {
        String parsed = Integer.toBinaryString(n);
        return Integer.parseInt(parsed);
    }
}
