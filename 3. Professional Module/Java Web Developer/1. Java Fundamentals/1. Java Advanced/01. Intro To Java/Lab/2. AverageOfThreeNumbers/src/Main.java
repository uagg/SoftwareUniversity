/*
Write program that reads three numbers. Print the average of the three, formatted to the second digit after the decimal point.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double firstNumber = input.nextDouble();
            double secondNumber = input.nextDouble();
            double thirdNumber = input.nextDouble();
        System.out.printf("%.2f", (firstNumber + secondNumber + thirdNumber) / 3);
    }
}
