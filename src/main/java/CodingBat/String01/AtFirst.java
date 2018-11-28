package CodingBat.String01;

public class AtFirst {
    public String atFirst(String str) {
        String res = "";
        if (str.length()>2) {
            res = str.substring(0,2);
        }

        if (str.length()==2) {
            res = str;
        }

        if (str.length()<2) {
            res = str + "@";
        }

        if (str.length()==0) {
            res = "@@";
        }
        return res;
    }
}
