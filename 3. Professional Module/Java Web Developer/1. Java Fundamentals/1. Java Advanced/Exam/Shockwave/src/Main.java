/*
Doctor T. decided to experiment with shockwaves. He performs his studies in a rectangular room of size N * M.
However what is interesting is that the shockwaves are also rectangular, through some unknown properties of matter.
There are pressure plates which indicate each time a shockwave hits a certain area in the room.
You will be given N and M – integers indicating the size of the room – in rows and columns. There is a plate in each
column. In the beginning the plates have value – 0, because no shockwaves have been executed.
After that you will begin receiving lines of exactly 4 integers, separated by a single space – X1, Y1, X2, Y2.
These are coordinates of the points which are the upper-left and the bottom-right corners of the rectangular shockwave.
You must increase the value of each plate in the area the rectangular shockwave affects, by 1. You must perform this
for every shockwave input.
When you receive the command “Here We Go”, that means Doctor T. is ready to check the results of the shockwaves.
You must print all the plates on rows, each plate’s value separated by a space.
Input
•	On the first line of input you will receive N and M – separated by a space.
•	On the next several lines you will receive the 4 integers – separated by a space, until you receive the command
“Here We Go”.
Output
•	Print all of the rows of the room, each on a new line, with all columns separated by a single space.
Constrains
•	The dimensions of the room - N and M, will be valid integers in range [1, 25].
•	Each of the given integers – X1, Y1, X2, Y2, will be inside the valid room indexes.
•	X2 will always be greater than or equal to X1, and Y2 will always be greater than or equal to Y1.
 */
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Room dimensions
        int[] input = Stream.of(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int N = input[0];
        int M = input[1];

        // Room
        int[][] room = new int[N][M];

        // Shockwave tests
        while (true) {
            // Stop-command or shockwave coordinates
            String input2 = sc.nextLine().trim();

            if ("Here We Go".equalsIgnoreCase(input2)) {
                break;
            } else {
                int[] coordinates = Stream.of(input2.split(" ")).mapToInt(Integer::parseInt).toArray();
                int x1 = coordinates[0];
                int y1 = coordinates[1];
                int x2 = coordinates[2];
                int y2 = coordinates[3];

                // Shockwave values in room
                for (int i = x1; i <= x2; i++) {
                    for (int j = y1; j <= y2; j++) {
                        room[i][j]++;
                    }
                }
            }
        }

        // Print the values after test
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < M; col++) {
                System.out.print(room[row][col] + " ");
            }
            System.out.println();
        }
    }
}