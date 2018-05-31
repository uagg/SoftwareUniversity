/*
Следващата задача има за цел да тренира работата с вложени проверки (nested if). Ето го и условието: предприемчив
българин отваря квартални магазинчета в няколко града и продава на различни цени:
град / продукт	coffee	water	beer	sweets	peanuts
Sofia	0.50	0.80	1.20	1.45	1.60
Plovdiv	0.40	0.70	1.15	1.30	1.50
Varna	0.45	0.70	1.10	1.35	1.55
Напишете програма, която чете от конзолата град (стринг), продукт (стринг) и количество (десетично число) и пресмята
и отпечатва колко струва съответното количество от избрания продукт в посочения град.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        item = item.toLowerCase();
        String city = scanner.nextLine();
        Double ammount = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if("coffee".equals(item)) {
            if("Sofia".equals(city)) {
                price = 0.5 * ammount;
            } else if("Plovdiv".equals(city)) {
                price = 0.4 * ammount;
            } else if("Varna".equals(city)) {
                price = 0.45 * ammount;
            }
        } else if("water".equals(item)) {
            if("Sofia".equals(city)) {
                price = 0.8 * ammount;
            } else if("Plovdiv".equals(city)) {
                price = 0.7 * ammount;
            } else if("Varna".equals(city)) {
                price = 0.7 * ammount;
            }
        } else if("beer".equals(item)) {
            if("Sofia".equals(city)) {
                price = 1.2 * ammount;
            } else if("Plovdiv".equals(city)) {
                price = 1.15 * ammount;
            } else if("Varna".equals(city)) {
                price = 1.1 * ammount;
            }
        } else if("sweets".equals(item)) {
            if("Sofia".equals(city)) {
                price = 1.45 * ammount;
            } else if("Plovdiv".equals(city)) {
                price = 1.3 * ammount;
            } else if("Varna".equals(city)) {
                price = 1.35 * ammount;
            }
        } else if("peanuts".equals(item)) {
            if("Sofia".equals(city)) {
                price = 1.6 * ammount;
            } else if("Plovdiv".equals(city)) {
                price = 1.5 * ammount;
            } else if("Varna".equals(city)) {
                price = 1.55 * ammount;
            }
        }

        DecimalFormat df = new DecimalFormat("##.#########");

        System.out.printf("%s", df.format(price));
    }
}