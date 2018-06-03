/*
Write a program that finds the factorial of a given number. Use recursion.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(Factorial(number));
    }

    private static int Factorial(int number) {
        if (number == 1) {
            return 1;
        }

        return number * Factorial(number - 1);
    }
}
