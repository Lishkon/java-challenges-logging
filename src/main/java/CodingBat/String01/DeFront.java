package CodingBat.String01;

public class DeFront {
    public String deFront(String str) {
        if (str.length()>2) {
            if (str.startsWith("a") && str.charAt(1)!='b'){
                return str.substring(0,1) + str.substring(2);
            }

            if (str.charAt(0)!='a' && str.charAt(1)=='b'){
                return  str.substring(1);
            }

            if (str.charAt(0)!='a' && str.charAt(1)!='b'){
                return str.substring(2);
            }
        }
        return str;
    }

}
