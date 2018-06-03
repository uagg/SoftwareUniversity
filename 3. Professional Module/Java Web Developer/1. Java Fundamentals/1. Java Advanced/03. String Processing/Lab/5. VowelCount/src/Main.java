/*
Find the count of all vowels in a given text using a regex.
The vowels that you should be looking for are upper and lower case: a, e, i, o, u and y.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();
        Pattern pattern = Pattern.compile("[AEIOUYaeiouy]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;

        while (matcher.find()) {
            count++;
        }

        System.out.printf("Vowels: %d",count);
    }
}
