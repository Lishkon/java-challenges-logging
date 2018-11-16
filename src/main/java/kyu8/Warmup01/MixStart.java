package kyu8.Warmup;

public class MixStart {
    public static boolean mixStart(String str){
        String temp = "ix";
        boolean flag = false;

        if(str.length() > 3) {
            if (temp.equals(str.substring(1, 3))) {flag = true;}
        } else if (str.length() < 3) { flag = false; }

        return flag;
    }

    //////////////////////////////////////////////////////////
    // More precise wat=y to solve the task:                //
    //    public static boolean mixStart(String str){       //
    //        if (str.length() < 3) return false;           //
    //        String two = str.substring(1, 3);             //
    //                                                      //
    //        if (two.equals("ix")) {                       //
    //            return true;                              //
    //        } else {                                      //
    //            return false;                             //
    //        }                                             //
    //    }                                                 //
    //////////////////////////////////////////////////////////

}
