/*
You are given a string of random characters, and a pattern of random characters. You need to “shake off” (remove)
all of the border occurrences of that pattern, in other words, the very first match and the very last match of
the pattern you find in the string.
When you successfully shake off a match, you remove from the pattern the character which corresponds to the index
equal to the pattern’s length / 2. Then you continue to shake off the border occurrences of the new pattern until
the pattern becomes empty or until there is less than the - needed for shake, matches in the remaining string.
In case you have found at least two matches, and you have successfully shaken them off, you print “Shaked it.”
on the console. Otherwise you print “No shake.”, the remains of the main string, and you end the program.
See the examples for more info.
Input
•	The input will consist only of two lines.
•	On the first line you will get a string of random characters.
•	On the second line you will receive the pattern and that ends the input sequence.
Output
•	You must print “Shaked it.” for every time you successfully do the melrah shake.
•	If the melrah shake fails, you print “No shake.”, and on the next line you print what has remained of the main string.
Constraints
•	The two strings may contain ANY ASCII character.
•	Allowed time/memory: 250ms/16MB.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder input = new StringBuilder(sc.nextLine());
        StringBuilder pattern = new StringBuilder(sc.nextLine());

        while(true) {

            if (pattern.length() == 0) {
                System.out.println("No shake.");
                System.out.println(input);
                return;
            }

            int firstIndex = input.indexOf(pattern.toString());
            int lastIndex = input.lastIndexOf(pattern.toString());

            if (firstIndex == - 1 || lastIndex == - 1 || firstIndex == lastIndex) {
                System.out.println("No shake.");
                System.out.println(input);
                return;
            }

            input.delete(lastIndex, lastIndex + pattern.length());
            input.delete(firstIndex, firstIndex + pattern.length());

            System.out.println("Shaked it.");

            pattern.deleteCharAt(pattern.length() / 2);
        }
    }
}
