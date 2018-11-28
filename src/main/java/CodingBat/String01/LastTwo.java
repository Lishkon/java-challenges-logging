package CodingBat.String01;

public class LastTwo {
    public String lastTwo(String str) {
        String res = str;
        if (str.length()>2) {
            String ending = String.valueOf(str.charAt(str.length()-1)) + String.valueOf(str.charAt(str.length()-2));
            res = str.substring(0,str.length()-2) + ending;
        } else if (str.length()==2) {
            res = String.valueOf(str.charAt(1)) + String.valueOf(str.charAt(0));
        }
        return res;
    }
}
