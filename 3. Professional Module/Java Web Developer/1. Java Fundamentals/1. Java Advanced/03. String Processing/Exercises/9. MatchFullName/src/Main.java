/*
Write a regular expression to match a valid full name. If you catch a valid match, print it as an output.
A valid full name:
•	Consists of two words
•	Each word starts with a capital letter
•	Each word contains only lowercase letters afterwards
•	Each word should be at least two letters long
•	The two words should be separated by a single space
Read lines until you get the "end" command.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder result = new StringBuilder();
        String input = sc.nextLine();

        while(! "end".equals(input)) {
            if (input.matches("^[A-Z][a-z]+ [A-Z][a-z]+$")) {
                result.append(input).append(System.lineSeparator());
            }
            input = sc.nextLine();
        }

        System.out.println(result);
    }
}
