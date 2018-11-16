package kyu8.Warmup02;

public class DoubleX {
    public static boolean doubleX(String str) {
        boolean flag = true;
        boolean lastX = str.indexOf('x')==str.length()-1;
        if(str.length()>2&&(!lastX)) {
            flag = str.charAt(str.indexOf('x')+1)=='x';
        } else if ((str.length()<2)||lastX) {
            flag = false;
        }

        return flag;
    }
}

/*
 *   Better solution:
 *
 *   boolean doubleX(String str) {
 *         int i = str.indexOf("x");
 *         if (i == -1) return false; // no "x" at all
 *         if (i+1 >= str.length()) return false; // check i+1 in bounds?
 *         return str.substring(i+1, i+2).equals("x");
 *   }
 *
 **/
