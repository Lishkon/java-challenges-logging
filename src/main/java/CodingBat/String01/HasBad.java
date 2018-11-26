package CodingBat.String01;

public class HasBad {
    public boolean hasBad(String str) {
        boolean res = false;
        if (str.length() > 3) {
            res = str.substring(0, 3).equals("bad");
        }

        if (str.length() >= 4) {
            res = str.substring(1, 4).equals("bad");
        }

        if (str.startsWith("bad")) {
            res = true;
        }
        return  res;
    }
}
