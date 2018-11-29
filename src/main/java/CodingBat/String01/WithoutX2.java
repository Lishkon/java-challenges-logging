package CodingBat.String01;

public class WithoutX2 {
    public String withoutX2(String str) {
        String res = "";
        if (str.length()>2) {
            String start = str.substring(0,2);
            if (start.contains("x")){
                res = start.replace("x","") + str.substring(2);
            } else res = str;
        } else if (str.contains("x")) {
            res = str.replace("x","");
        } else res = str;

        return res;
    }
}
