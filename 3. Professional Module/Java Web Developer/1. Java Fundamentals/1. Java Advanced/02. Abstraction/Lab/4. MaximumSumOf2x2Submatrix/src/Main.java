/*
Write a program that reads a matrix from the console. Then find the biggest sum of a 2x2 submatrix.
Print the submatrix and its sum.
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
        int bestSum = Integer.MIN_VALUE;
        int res1 = 0;
        int res2 = 0;
        int res3 = 0;
        int res4 = 0;

        for (int row = 0; row < rows; row++) {
            String[] inputTokens = input.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (sum > bestSum) {
                    bestSum = sum;
                    res1 = matrix[row][col];
                    res2 = matrix[row][col + 1];
                    res3 = matrix[row + 1][col];
                    res4 = matrix[row + 1][col + 1];
                }
            }
        }
        System.out.println(res1 + " " + res2);
        System.out.println(res3 + " " + res4);
        System.out.println(bestSum);
    }
}
