/*
Write a program that reads a keyword and some text from the console and prints all sentences from the text,
containing that word.
A sentence is any sequence of words that:
•	ends with a dot ('.'),  an exclamation mark ('!') or a question mark ('?').
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String keyWord = sc.nextLine();
        String text = sc.nextLine();

        Pattern pattern = Pattern.compile("\\s*[A-Za-z,’\\-;'\"\\s]+[.?!]");
        Matcher matcher = pattern.matcher(text);

        StringBuilder output = new StringBuilder();
        while (matcher.find()) {
            boolean hasKeyWord = false;

            for (String s : matcher.group(0).split("\\s+")) {
                if (keyWord.equals(s)) {
                    hasKeyWord = true;
                    break;
                }
            }

            if (hasKeyWord)
                output.append(matcher.group(0).trim()).append(System.lineSeparator());
        }

        System.out.println(output);
    }
}