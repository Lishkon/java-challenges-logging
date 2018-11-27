package CodingBat.String01;

public class FirstTwo {
    public String firstTwo(String str) {
        if (str.length()>2) return str.substring(0,2);
        else return str;
    }
}
