/*
Filling a matrix in the regular way (top to bottom and left to right) is boring.
Write two methods that fill a matrix of size N x N in two different patterns.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] tokens = input.nextLine().split(", ");
        int n = Integer.parseInt(tokens[0]);
        char variant = tokens[1].charAt(0);
        if (variant == 65) {
            int[][] result = FillMatrixA(n);
            PrintMatrix(result);
        } else if (variant == 66) {
            int[][] result = FillMatrixB(n);
            PrintMatrix(result);
        }
    }

    private static void PrintMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] FillMatrixB(int count) {
        int[][] result = new int[count][count];
        int counter = 1;
        for (int col = 0; col < count; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < count; row++) {
                    result[row][col] = counter++;
                }
            } else {
                for (int row = count - 1; row >= 0 ; row--) {
                    result[row][col] = counter++;
                }
            }
        }

        return  result;
    }

    private static int[][] FillMatrixA(int count) {
        int[][] result = new int[count][count];
        int counter = 1;
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                result[col][row] = counter++;
            }
        }

        return  result;
    }
}
