/*
Write a regular expression to match a valid phone number.
A valid number:
•	Starts with "+359"
•	Followed by the area code "2"
•	Followed by number itself, consisting of 7 digits (separated in two group of 3 and 4 digits respectively)
•	Every part of the number should be separated by either a space (' ') or a hyphen ('-'), but not both in a same valid number
Read lines until you get the "end" command.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String regex = "\\+359(\\s+|-)2\\1(\\d{3})\\1(\\d{4})$";

        List<String> validPhoneNumbers = new ArrayList<>();

        while(! "end".equals(input)) {
            if (Pattern.matches(regex, input)) {
                validPhoneNumbers.add(input);
            }
            input = sc.nextLine();
        }

        for (String phone : validPhoneNumbers) {
            System.out.println(phone);
        }
    }
}
