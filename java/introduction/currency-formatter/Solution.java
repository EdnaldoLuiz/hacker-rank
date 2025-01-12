import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        Locale indiaLocale = new Locale("en", "IN");
        
        String us = getCurrency(Locale.US, payment);
        String india = getCurrency(indiaLocale, payment);
        String china = getCurrency(Locale.CHINA, payment);
        String france = getCurrency(Locale.FRANCE, payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
    public static String getCurrency(Locale locale, double payment) {
        return NumberFormat
        .getCurrencyInstance(locale)
        .format(payment);
    }
}