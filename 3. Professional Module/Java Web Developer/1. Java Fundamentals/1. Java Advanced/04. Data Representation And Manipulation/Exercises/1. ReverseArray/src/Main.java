/*
Write a program that reverses and prints an array. Use recursion.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(" ");
        int[] parsedArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            parsedArray[i] = Integer.parseInt(inputArray[i]);
        }

        StringBuilder result = new StringBuilder();

        Reverse(parsedArray,0 ,parsedArray.length - 1);
        for (int i : parsedArray) {
            result.append(i + " ");
        }

        System.out.print(result.toString().trim());
    }

    private static void Reverse(int[] parsedArray, int start, int end) {
        if (start < end) {
            int temp = parsedArray[start];
            parsedArray[start] = parsedArray[end];
            parsedArray[end] = temp;
            Reverse(parsedArray, start + 1, end - 1);
        }
    }
}
