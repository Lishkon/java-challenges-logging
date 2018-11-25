package CodingBat.String01;

public class MiddleTwo {
    public String middleTwo(String str) {
        return String.valueOf(str.charAt((str.length()/2)-1)) + String.valueOf(str.charAt(str.length()/2));
    }
}
