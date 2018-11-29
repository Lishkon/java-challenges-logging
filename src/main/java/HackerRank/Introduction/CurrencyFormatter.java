package HackerRank.Introduction;

// Given a double-precision number, 'payment', denoting an amount of money, use the NumberFormat class'
// getCurrencyInstance method to convert 'payment' into the US, Indian, Chinese, and French currency formats.
// Then print the formatted values as follows:
//
// US: formattedPayment
// India: formattedPayment
// China: formattedPayment
// France: formattedPayment

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        // Creating a formatted output
        String us = String.valueOf(NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        String india = String.valueOf(NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment));
        String china = String.valueOf(NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        String france = String.valueOf(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));

        // Printing the formatted strings in correspondence to the needed currency
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
