/*
Your task is to print the first N rows of the Pascal Triangle. You will receive a single integer number N as an input.
The Pascal triangle is constructed in the following manner: On the topmost row there is a unique nonzero entry 1.
Each entry of each subsequent row is constructed by adding the number above and to the left with the number above
and to the right.
If you can get more info about it here: https://en.wikipedia.org/wiki/Pascal's_triangle
 */
import java.math.BigInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        BigInteger[][] pascal = new BigInteger[size + 1][];
        pascal[1] = new BigInteger[3];
        pascal[1][1] = new BigInteger("1");

        for (int i = 2; i <= size; i++) {
            pascal[i] = new BigInteger[i + 2];

            for (int j = 1; j < pascal[i].length - 1; j++) {
                if (pascal[i - 1][j - 1] == null) {
                    pascal[i - 1][j - 1] = new BigInteger("0");
                }

                if (pascal[i - 1][j] == null) {
                    pascal[i - 1][j] = new BigInteger("0");
                }

                pascal[i][j] = pascal[i - 1][j - 1].add(pascal[i - 1][j]);
            }
        }

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < pascal[i].length - 1; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}