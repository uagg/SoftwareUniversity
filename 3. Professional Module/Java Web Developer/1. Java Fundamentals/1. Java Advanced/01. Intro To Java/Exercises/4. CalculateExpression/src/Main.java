/*
Write a program that reads three floating point numbers a, b, and c from the console and calculates the following expressions:
f1 = ((a2 + b2) / (a2 – b2))(a + b + c) / √c             f2 = (a2 + b2 - c3)(a – b)
Then the program calculates the absolute value of the difference between the average of the three numbers and the
average of the two expressions.
Abs (Avg (a, b, c) – Avg (f1, f2))
You will receive a, b and c on a single line, separated by one or more white spaces.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double formula1Fraction = (((a * a) + (b * b))/((a * a) - (b * b)));
        double formula1Degree = (a + b + c) / Math.sqrt(c);
        double formula1 = Math.pow(formula1Fraction, formula1Degree);

        double formula2Fraction = ((a * a)  + (b * b) - (c * c * c));
        double formula2Degree = (a - b);
        double formula2 = Math.pow(formula2Fraction, formula2Degree);

        double avgBetweenNumbers = (a + b + c) / 3;
        double avgBetweenFormulas = (formula1 + formula2) / 2;
        double absDiff = Math.abs(avgBetweenNumbers - avgBetweenFormulas);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", formula1, formula2, absDiff);
    }
}
