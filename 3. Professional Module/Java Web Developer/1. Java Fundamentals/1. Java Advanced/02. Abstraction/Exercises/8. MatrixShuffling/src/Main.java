/*
Write a program which reads a string matrix from the console and performs certain operations with its elements.
User input is provided in a similar way like in the problems above – first you read the dimensions and then the data.
Your program should then receive commands in format: "swap row1 col1 row2c col2" where row1, row2, col1,
col2 are coordinates in the matrix. In order for a command to be valid, it should start with the "swap"
keyword along with four valid coordinates (no more, no less). You should swap the values at the given
coordinates (cell [row1, col1] with cell [row2, col2]) and print the matrix at each step (thus you'll be
able to check if the operation was performed correctly).
If the command is not valid (doesn't contain the keyword "swap", has fewer or more coordinates entered
or the given coordinates do not exist), print "Invalid input!" and move on to the next command.
Your program should finish when the string "END" is entered.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrayDimensions = input.nextLine().split(" ");
        int rows = Integer.parseInt(arrayDimensions[0]);
        int cols = Integer.parseInt(arrayDimensions[1]);
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] inputString = input.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = inputString[col];
            }
        }

        String[] commands = input.nextLine().split(" ");
        boolean isEnd = false;
        while (!isEnd) {
            boolean hasInvalid = false;
            if (commands[0].equals("END")) {
                isEnd = true;
                break;
            }
            if (commands[0].equals("swap") && commands.length == 5) {
                int x1 = Integer.parseInt(commands[1]);
                int y1 = Integer.parseInt(commands[2]);
                int x2 = Integer.parseInt(commands[3]);
                int y2 = Integer.parseInt(commands[4]);

                try {
                    matrix = SwapElements(matrix, x1, y1, x2, y2);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid input!");
                    hasInvalid = true;
                }
            } else {
                System.out.println("Invalid input!");
                hasInvalid = true;
            }

            if (!hasInvalid) {
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.printf("%s ",matrix[row][col]);
                    }
                    System.out.println();
                }
            }

            if (hasInvalid) {
                commands = input.nextLine().split(" ");
            } else {
                commands = input.nextLine().split(" ");
            }
        }
    }

    private static String[][] SwapElements(String[][] matrix, int x1, int y1, int x2, int y2) {
        String temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;

        return matrix;
    }
}