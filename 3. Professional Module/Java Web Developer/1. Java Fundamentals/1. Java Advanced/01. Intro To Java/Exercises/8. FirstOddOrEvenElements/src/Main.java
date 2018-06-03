/*
Write a program that returns the first N odd/even elements from a collection. Return as many as you can.
Format of the input: Get {number of elements} {odd/even}
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] arrayAsString = console.nextLine().split("\\s+");
        String[] command = console.nextLine().split("\\s+");
        int[] array = new int[arrayAsString.length];
        int printCount = Integer.parseInt(command[1]);

        for (int i = 0; i < arrayAsString.length; i++) {
            array[i] = Integer.parseInt(arrayAsString[i]);
        }

        switch (command[2]) {
            case "odd":
                for (int element : array) {
                    if (printCount == 0) {
                        break;
                    }

                    if ((element % 2) != 0) {
                        System.out.print(element + " ");
                        printCount--;
                    }
                }
                break;
            case "even":
                for (int element : array) {
                    if (printCount == 0) {
                        break;
                    }

                    if ((element % 2) == 0) {
                        System.out.print(element + " ");
                        printCount--;
                    }
                }
                break;
            default: break;
        }
    }
}