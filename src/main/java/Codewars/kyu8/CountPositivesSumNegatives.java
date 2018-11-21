package Codewars.kyu8;

import java.util.stream.IntStream;

public class CountPositivesSumNegatives {
    public static int[] countPositiveSumNegatives(int[] input) {
        /*
        *  1. Объявляем переменную типа int, называем ее positiveCount, присваиваем ей значение 0.
        *  2. Объявляем переменную типа int, называем ее negativeSum, присваиваем ей значение 0.
        *  3. Объявляем массив чисел типа int, называем его output,
        *  4. Проходимся по массиву input, находим его положительные элементы
        *  5. После каждого найденного положительного элемента, инкрементируем переменную positiveCount.
        *  6. Проходимся по массиву input, находим его отрицательные элементы и суммируем
        *  7. Присваиваем результат суммирования отрицательных элементов массива переменной negativeSum
        *  8. Выводим переменные positiveCount и negativeSum в виде массива output
        *
        *  If the input array is empty or null, return an empty array:
        *
        *  https://www.codewars.com/kata/count-of-positives-slash-sum-of-negatives/train/java
        * */
//        int positiveCount = 0;
//        int negativeSum = 0;
//        int[] result = new int[]{};
        if (input.length>2){
//            result[0] = (int) IntStream.of(input).filter(s-> s > 0).count();
//            result[1] = IntStream.of(input).filter(s-> s < 0).sum();
            return new int[]{(int) IntStream.of(input).filter(s-> s > 0).count(),IntStream.of(input).filter(s-> s < 0).sum()};
        } else {
            return new int[]{};
        }
//        return result;
    }
}
