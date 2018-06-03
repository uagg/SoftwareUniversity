/*
Write a program that finds the sum of all elements in an integer array. Use recursion.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] inputLine = input.nextLine().split(" ");

        int[] a = new int[inputLine.length];

        for (int i = 0; i < inputLine.length; i++) {
            a[i] = Integer.parseInt(inputLine[i]);
        }

        System.out.println(sum(a, 0));
    }

    private static int sum(int[] a, int index) {
        if (index == a.length - 1) {
            return a[index];
        }
        return a[index] + sum(a, index + 1);
    }
}
