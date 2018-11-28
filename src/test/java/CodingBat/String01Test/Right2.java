package CodingBat.String01Test;

public class Right2 {
    public String right2(String str) {
        String res = "";
        if (str.length() > 2) res = str.substring(str.length()-2)+str.substring(0,str.length()-2);
        if (str.length()==2) res = str;
        return res;
    }
}
