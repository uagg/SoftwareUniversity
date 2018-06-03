/*
Create a method that calculates a triangle area by a given:
•	Base
•	Height
Return the area as an output of the program. Format the result to the second digit after the decimal separator.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double result = triangleArea(base, height);
        System.out.printf("Area = %.2f", result);
    }

    private static double triangleArea(double base, double height) {
        double formula = (base * height) / 2;
        return  formula;
    }
}
