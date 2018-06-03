/*
Read a string from the console and replace all series of consecutive identical letters with a single one.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] inputArray = input.nextLine().toCharArray();
        StringBuilder output = new StringBuilder();
        int state = 0;
        int index = 0;
        char prev = inputArray[0];

        while (index < inputArray.length) {
            switch (state) {
                case 0: // Initial state
                    prev = inputArray[index];
                    state = 1;
                    break;
                case 1: // New letter
                    output.append(inputArray[index - 1]);

                    if (prev == inputArray[index]) {
                        state = 2;
                    }
                    prev = inputArray[index];
                    break;
                case 2: // Same letter
                    if (inputArray[index] != prev) {
                        state = 1;
                    }
                    prev = inputArray[index];
                    break;
            }
            ++index;
        }

        if (inputArray[index - 2] != prev) {
            output.append(prev);
        }

        System.out.println(output.toString());
    }
}