/*
Write a program that reads the sides of a rectangle (two integers a and b), calculates and prints the rectangle's area.
Format the result to the second digit after the decimal separator.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.next());
        double b = Double.parseDouble(input.nextLine());
        System.out.printf("%.2f", a * b);
    }
}