/*
Напишете програма за конвертиране на парична сума от една валута в друга. Трябва да се поддържат следните валути:
BGN, USD, EUR, GBP. Използвайте следните фиксирани валутни курсове:
1 BGN	1.79549	1.95583	2.53405
Входът e сума за конвертиране + входна валута + изходна валута.
Изходът е едно число – преобразуваната сума по посочените по-горе курсове, закръглен до 2 цифри след десетичната точка.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double bgn = 1;
        double usd = 1.79549;
        double eur = 1.95583;
        double gbp = 2.53405;
        double firstConvert = 0;
        double secondConvert = 0;

        Scanner scanner = new Scanner(System.in);
        double ammount = scanner.nextDouble();
        scanner.nextLine();
        String inputCurrency = scanner.nextLine();
        String outputCurrency = scanner.nextLine();
        switch (inputCurrency) {
            case "BGN":
                firstConvert = ammount * bgn;
                break;
            case "USD":
                firstConvert = ammount * usd;
                break;
            case "EUR":
                firstConvert = ammount * eur;
                break;
            case "GBP":
                firstConvert = ammount * gbp;
                break;
        }

        switch (outputCurrency) {
            case "BGN":
                secondConvert =  firstConvert / bgn;
                break;
            case "USD":
                secondConvert =  firstConvert / usd;
                break;
            case "EUR":
                secondConvert = firstConvert / eur;
                break;
            case "GBP":
                secondConvert = firstConvert / gbp;
                break;
        }
        System.out.printf("%.2f", secondConvert);

    }
}