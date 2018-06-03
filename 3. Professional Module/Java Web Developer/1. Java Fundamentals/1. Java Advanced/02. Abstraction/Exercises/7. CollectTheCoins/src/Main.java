/*
Working with multidimensional arrays can be (and should be) fun. Let's make a game out of it.
You receive the layout of a board from the console. Assume it will always have 4 rows which you'll get as strings,
each on a separate line. Each character in the strings will represent a cell on the board. Note that the strings may
be of different lengths.
You are the player and start at the top-left corner (that would be position [0, 0] on the board). On the fifth line
of input you'll receive a string with movement commands which tell you where to go next, it will contain only these
four characters – '>' (move right), '<' (move left), '^' (move up) and 'v' (move down).
You need to keep track of two types of events – collecting coins (represented by the symbol '$', of course)
and hitting the walls of the board (when the player tries to move off the board to invalid coordinates).
When all moves are over, print the amount of money collected and the number of walls hit.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[4][];
        for (int row = 0; row < 4; row++) {
            matrix[row] = scanner.nextLine().split("");
        }

        String[] commands = scanner.nextLine().split("");

        int currentRow = 0;
        int currentCol = 0;

        int collectedCoins = 0;
        int wallsHit = 0;

        if (matrix[0][0].equals("$")) {
            collectedCoins++;
        }

        for (String command : commands) {
            String token = "";
            if (command.equals(">")) {
                try {
                    currentCol += 1;
                    token = matrix[currentRow][currentCol];
                } catch (Exception e) {
                    currentCol--;
                    wallsHit++;
                }
            } else if (command.equals("<")) {
                try {
                    currentCol -= 1;
                    token = matrix[currentRow][currentCol];
                } catch (Exception e) {
                    currentCol++;
                    wallsHit++;
                }
            } else if (command.equals("V")) {
                try {
                    currentRow += 1;
                    token = matrix[currentRow][currentCol];
                } catch (Exception e) {
                    currentRow--;
                    wallsHit++;
                }
            } else if (command.equals("^")) {
                try {
                    currentRow -= 1;
                    token = matrix[currentRow][currentCol];
                } catch (Exception e) {

                    currentRow++;
                    wallsHit++;
                }
            }

            if (token.equals("$")) {
                collectedCoins++;
            }
            token = "";
        }

        System.out.println("Coins = " + collectedCoins);
        System.out.println("Walls = " + wallsHit);
    }
}