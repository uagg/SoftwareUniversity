/*
Find the count of 2 x 2 squares of equal chars in a matrix.
Input
•	The matrix size is given at the first row (rows and columns).
•	Matrix characters come at the next rows lines (space separated).
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] dimensions = input.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] entry = input.nextLine().split(" ");
            char[] parsedValues = new char[entry.length];

            for (int j = 0; j < entry.length; j++) {
                parsedValues[j] = entry[j].charAt(0);
            }

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = parsedValues[col];
            }
        }

        int counter = 0;

        for(int i=0; i<rows-1; i++)
        {
            for(int j=0; j<cols-1; j++)
            {
                if(matrix[i][j] == matrix[i][j+1] && matrix[i][j] == matrix[i+1][j] && matrix[i][j] == matrix[i+1][j+1])
                {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
