package algorithm.examples;

import java.text.*;
import java.util.Locale;

public class CurrencyFormatter {
    public static void main(String[] args) {
        var decimalFormat = new DecimalFormat("#,##0.00");
        var payment = 12324.134;

        if (payment <= 0 || payment >= 1e9)
            throw new IllegalArgumentException("Payment must be between 0 and 10^9");

        var usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        var us = usFormat.format(payment);

        var india = decimalFormat.format(payment);
        india = "Rs." + india;

        var china = decimalFormat.format(payment);
        china = "\uFFE5" + china;

        var franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        var france = franceFormat.format(payment).replace("\u202F", " ");

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
