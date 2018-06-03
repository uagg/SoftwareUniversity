/*
A student travels n kilometers using only one type of transport based on the distance that he will travel:
•	Taxi: Initial tax: 0.70 USD. Daytime cost: 0.79 USD/km. Night time cost: 0.90 USD/km.
•	Bus: Day / Night tariff: 0.09 USD/km. For at least 20 kilometers.
•	Train: Day / Night tariff: 0.06 USD/km. For at least 100 kilometers.
Write a program that calculates the price of the trip by a given distance and time of day.
Format the output to the second digit after the decimal separator.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kilometers = Integer.valueOf(input.nextLine());
        String dayOrNight = input.nextLine();

        if (kilometers < 20) {
            if (dayOrNight.equals("day")) {
                System.out.printf("%.2f", (0.70 + (0.79 * kilometers)));
            } else if (dayOrNight.equals("night")) {
                System.out.printf("%.2f", (0.70 + (0.90 * kilometers)));
            }
        } else if (kilometers >= 20 && kilometers < 100) {
            System.out.printf("%.2f", 0.09 * kilometers);
        } else if (kilometers >= 100) {
            System.out.printf("%.2f",0.06 * kilometers);
        }
    }
}
