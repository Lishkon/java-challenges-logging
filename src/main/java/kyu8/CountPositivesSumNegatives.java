package kyu8;

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

        int positiveCount = (int) IntStream.of(input).filter(s-> s > 0).count();
        int negativeSum = (int) IntStream.of(input).filter(s-> s < 0).sum();
        int[] output = {positiveCount, negativeSum};
        if (input.length == 0 || IntStream.of(input).filter(input == null).findAny().isPresent()) {
            output = new int[0];
        }
        return output;
    }
}
