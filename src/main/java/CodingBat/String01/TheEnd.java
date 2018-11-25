package CodingBat.String01;

public class TheEnd {
    public String theEnd(String str, boolean front) {
        return String.valueOf(front ? str.charAt(0) : str.charAt(str.length()-1));
    }
}
