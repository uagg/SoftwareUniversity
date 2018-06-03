/*
Write a console Java program, which prints "Hello Java".
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstWord = input.next();
        String secondWord = input.next();

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        String lastWord = input.next();

        System.out.println(firstWord + " " + secondWord + " " + lastWord + " " + (firstNumber + secondNumber + thirdNumber));
    }
}
