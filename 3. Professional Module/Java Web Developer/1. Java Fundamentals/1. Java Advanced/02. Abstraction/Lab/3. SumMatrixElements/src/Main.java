/*
Write a program that reads a matrix from the console and prints:
•	The count of rows
•	The count of columns
•	The sum of all matrix’s elements
On the first line you will get the dimensions of the matrix in format {rows, columns}.
On the next lines you will get the elements for each row separated with a coma.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] in = input.nextLine().split(", ");
        int rows = Integer.parseInt(in[0]);
        int cols = Integer.parseInt(in[1]);

        int[][] matrix = new int[rows][cols];
        int sum = 0;

        for (int row = 0; row < rows; row++) {
            String[] inputTokens = input.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
                sum += Integer.parseInt(inputTokens[col]);
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }
}
