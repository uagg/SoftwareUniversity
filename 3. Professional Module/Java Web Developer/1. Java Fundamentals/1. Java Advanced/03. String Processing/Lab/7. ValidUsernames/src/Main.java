/*
Scan through the lines for valid usernames.
A valid username:
•	Has length between 3 and 16 characters
•	Contains only letters, numbers, hyphens and underscores
•	Has no redundant symbols before, after or in between
Read the lines until you get the "END" command. If there are no valid usernames, don’t print anything.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]{3,16}$");

        while (!username.equals("END")) {
            Matcher matcher = pattern.matcher(username);
            if (matcher.find()) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }

            username = input.nextLine();
        }
    }
}
