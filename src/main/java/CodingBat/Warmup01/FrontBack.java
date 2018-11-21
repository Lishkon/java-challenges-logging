package CodingBat.Warmup01;

/*
 *  Source: https://codingbat.com/prob/p123384
 **/
public class FrontBack {
    public String frontBack(String str) {
        String result = "";
        if(str.length()>2){
            String mid = str.substring(1, str.length()-1);
            result = str.charAt(str.length()-1) + mid + str.charAt(0);
        }

        if(str.length()<2){
            result = str;
        }

        if(str.length()<3 && str.length()>1){
            result = str.charAt(1)+""+str.charAt(0);
        }
        return result;
    }
}
//
// Seems to be a better solution:
//          if (str.length() <= 1) return str;
//          String mid = str.substring(1, str.length()-1);
//          //last + mid + first
//          return str.charAt(str.length()-1) + mid + str.charAt(0);
//