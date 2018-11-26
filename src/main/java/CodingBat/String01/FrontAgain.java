package CodingBat.String01;

public class FrontAgain {
    public boolean frontAgain(String str) {
        if (str.length()>2) return str.substring(0,2).equals(str.substring(str.length()-2));
        else return str.length() == 2;
    }
}
