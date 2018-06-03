/*
You are given 8 positive 32-bit integer numbers. Write a program to count all X-bits.
 X-bits are groups of 9 bits (3 rows x 3 columns) forming the letter "X". Your task is to count all X-bits and print
 their count on the console. Valid X-bits consist of 3 numbers where their corresponding bit indexes are exactly
 {"101", "010", "101"}. All other combinations like: {"111", "010", "101"} or {"111", "111", "111"} are invalid.
 All valid X-bits can be part of multiple X-bits (with overlapping). Check the example on the right to understand
 your task better.
Input
The input data should be read from the console.
•	On the first 8 lines, you will be given 8 32-bit positive integers.
The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
The output should be printed on the console. It should consist of exactly 1 line:
•	At the first line print the count of the X-bits.
Constraints
•	The 8 input integers will be in the range [0 … 2 147 483 647].
•	Allowed working time: 0.2 seconds. Allowed memory: 16 MB.

 */
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String[] binaries = new String[8];

        for (int index = 0; index < binaries.length; index++) {
            String line = String.format("%32s", Integer.toBinaryString(
                    Integer.parseInt(sc.nextLine()))).replace(' ', '0');
            binaries[index] = line;
        }

        char[][] table = new char[8][32];

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = binaries[row].charAt(col);
            }
        }

        int[][] binaryTable = new int[8][32];

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                binaryTable[row][col] = Character.getNumericValue(table[row][col]);
            }
        }


        int cntr = 0;

        for (int row = 0; row < binaryTable.length - 2; row++) {
            for (int col = 0; col < binaryTable[row].length - 2; col++) {

                if (binaryTable[row][col] == 1 && binaryTable[row][col + 1] == 0 && binaryTable[row][col + 2] == 1 &&
                        binaryTable[row + 1][col] == 0 && binaryTable[row + 1][col + 1] == 1 && binaryTable[row + 1][col + 2] == 0 &&
                        binaryTable[row + 2][col] == 1 && binaryTable[row + 2][col + 1] == 0 && binaryTable[row + 2][col + 2] == 1) {
                    cntr++;
                }
            }
        }
        System.out.println(cntr);
    }
}
