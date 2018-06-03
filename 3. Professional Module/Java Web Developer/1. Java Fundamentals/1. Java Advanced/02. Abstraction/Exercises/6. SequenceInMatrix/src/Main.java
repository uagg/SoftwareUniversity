/*
You are given a matrix of strings of size N x M. Sequences in the matrix are defined as sets of several
neighbour elements, located on the same diagonal, line or column . Write a program that finds the longest
sequence of equal strings in the matrix.
If there are two sequences with the same length, print the one that you found last (Check the diagonals first,
then the lines and last the columns)
Input
•	On the first line, you will receive the rows N and columns M.
•	On the next N lines you will receive each row with its elements.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] tokens = input.nextLine().split(" ");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            Scanner input2 = new Scanner(System.in);
            String[] matrixInput = input2.nextLine().split(" ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = matrixInput[col];
            }
        }

        int maxInRow = 0;
        int maxInCol = 0;
        int longestSeq = 1;
        int counter = 1;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols - 1; j++) {

                if (matrix[i][j].equals(matrix[i][j + 1])) {
                    counter++;

                    if (counter > longestSeq) {
                        longestSeq = counter;
                        maxInRow = i;
                        maxInCol = counter - j;
                    }
                }
            }
            counter = 1;
        }

        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < rows - 1; j++) {

                if (matrix[j][i].equals(matrix[j + 1][i])) {
                    counter++;

                    if (counter > longestSeq) {
                        longestSeq = counter;
                        maxInRow = counter - j;
                        maxInCol = i;
                    }
                }
            }
            counter = 1;
        }

        for (int i = 0; i < rows - 1; i++) {

            for (int j = 0; j < cols - 1; j++) {

                if (matrix[i][j].equals(matrix[i + 1][j + 1])) {
                    int r = i;
                    int c = j;

                    while (matrix[r][c].equals(matrix[r + 1][c + 1])) {
                        counter++;

                        if (counter > longestSeq) {
                            longestSeq = counter;
                            maxInRow = i;
                            maxInCol = j;
                        }
                        r++;
                        c++;

                        if (r == matrix[rows].length - 1 || c == matrix[cols].length - 1) {
                            break;
                        }
                    }
                }
            }
            counter = 1;
        }

        String[] valueOfSeq = new String[longestSeq];

        for (int i = 0; i < longestSeq; i++) {
            valueOfSeq[i] = matrix[maxInRow][maxInCol];
        }

        System.out.println(String.join(", ", valueOfSeq));
    }
}
