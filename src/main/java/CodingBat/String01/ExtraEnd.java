package CodingBat.String01;

public class ExtraEnd {
    public String extraEnd(String str) {
        String output = str.substring(str.length()-2);
        return output + output + output;
    }
}
