/*
Write a program to generate the following matrix of palindromes of 3 letters with r rows and c columns like the one
in the examples below.
•	Rows define the first and the last letter: row 0  ‘a’, row 1  ‘b’, row 2  ‘c’, …
•	Columns + rows define the middle letter:
o	column 0, row 0  ‘a’, column 1, row 0  ‘b’, column 2, row 0  ‘c’, …
o	column 0, row 1  ‘b’, column 1, row 1  ‘c’, column 2, row 1  ‘d’, …
Input
•	The numbers r and c stay at the first line at the input.
•	 r and c are integers in the range [1…26].
•	 r + c ≤ 27
Examples
Input	Output
4 6	    aaa aba aca ada aea afa
bbb     bcb bdb beb bfb bgb
ccc     cdc cec cfc cgc chc
ddd     ded dfd dgd dhd did

3 2	    aaa aba
        bbb bcb
        ccc cdc
Hints
•	Use two nested loops to generate the matrix.
•	Print the matrix row by row in a loop.
•	Don’t forget to pack everything in methods.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] tokens = input.nextLine().split(" ");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        String[][] result = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                result[row][col] = "" + (char)('a' + row) + (char)('a' + row + col) + (char)('a' + row);
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }
    }
}
