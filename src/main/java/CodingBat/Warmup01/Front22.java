package CodingBat.Warmup01;

public class Front22 {
    public String front22(String str) {
        if (str.length()>2) {
            String append = str.substring(0,2);
            return append + str + append;
        } else {
            return str + str + str;
        }

    }
}
