/*
You are given an array of integers as a single line, separated by a space. Write a program that checks
consecutive pairs and prints if both are odd/even or not.
Note that the array length should also be an even number.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrayOfDigits = input.nextLine().split(" ");

        if (arrayOfDigits.length %2 != 0) {
            System.out.println("invalid length");

        } else {
            int[] arrayOfNumbers = new int[arrayOfDigits.length];

            for (int i = 0; i < arrayOfDigits.length; i++) {
                arrayOfNumbers[i] = Integer.parseInt(arrayOfDigits[i]);
            }

            for (int i = 0; i < arrayOfNumbers.length - 1; i+=2) {
                int currentNumber = arrayOfNumbers[i];
                int nextNumber = arrayOfNumbers[i + 1];

                if ((currentNumber % 2 == 0) && (nextNumber % 2 == 0)) {
                    System.out.printf("%d, %d -> both are even\n", currentNumber, nextNumber);
                } else if ((currentNumber % 2 != 0) && (nextNumber % 2 != 0)) {
                    System.out.printf("%d, %d -> both are odd\n", currentNumber, nextNumber);
                } else if (((currentNumber % 2 != 0) && (nextNumber % 2 == 0)) || ((currentNumber % 2 == 0) && (nextNumber % 2 != 0))) {
                    System.out.printf("%d, %d -> different\n", currentNumber, nextNumber);
                }
            }
        }
    }
}
