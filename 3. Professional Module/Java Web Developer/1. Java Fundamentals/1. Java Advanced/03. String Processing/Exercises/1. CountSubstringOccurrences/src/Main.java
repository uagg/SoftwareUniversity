/*
Write a program to find how many times a given string appears in a given text as substring. The text is given at the
first input line. The search string is given at the second input line. The output should be an integer number.
Ignore the character casing. Overlapping between occurrences is allowed.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        String part = input.nextLine().toLowerCase();

        int index = 0;
        int counter = 0;
        int setIndex = 0;
        while (setIndex != -1) {
            setIndex = text.indexOf(part, index);
            index = setIndex + 1;
            if (setIndex != -1) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
