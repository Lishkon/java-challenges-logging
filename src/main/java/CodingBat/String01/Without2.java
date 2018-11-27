package CodingBat.String01;

public class Without2 {
    public String without2(String str) {
        String res = "";
        if (str.length()>2 && str.endsWith(str.substring(0, 2))) res = str.substring(2);
        else if (str.length()==2) res = "";
        else res = str;
        return res;
    }
}
