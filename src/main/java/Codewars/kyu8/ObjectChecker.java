package Codewars.kyu8;

/*
 *   You will be given an array 'a' and a value 'x'. All you need to do is check whether the provided array contains
 *   the value.
 *
 *   Array can contain numbers or strings. X can be either.
 *
 *   Return 'true' if the array contains the value, 'false' if not.
 *
 *   Kata url: https://www.codewars.com/kata/you-only-need-one-beginner/train/java
 *
 **/

class ObjectChecker {
    static boolean check(Object[] a, Object x) {
        boolean res = false;
        for (Object o : a){
            if (o == x) {
                res = true;
            }
        }
        return res;
    }

    // Better solution:
    // return Arrays.asList(a).contains(x);
}
