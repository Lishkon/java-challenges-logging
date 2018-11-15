package kyu8.Warmup;

public class Front3 {
    public String front3(String str) {
        StringBuilder front = new StringBuilder();
        for (int i=0; i<3; i++){
            if (str.length()>3) {
                front.append(str, 0, 3);
            } else {
                front.append(str);
            }

        }
        return front.toString();
    }
//
//    Better solution:
//    public String front3(String str) {
//        String front;
//
//        if (str.length() >= 3) {
//            front = str.substring(0, 3);
//        }
//        else {
//            front = str;
//        }
//
//        return front + front + front;
//    }
//
}
