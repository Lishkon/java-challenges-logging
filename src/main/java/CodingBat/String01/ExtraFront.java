package CodingBat.String01;

public class ExtraFront {
    public String extraFront(String str) {
        String res = "";
        if (str.length()>2) {
            res = str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
        } else {
            res = str + str + str;
        }
        return res;
    }
}
