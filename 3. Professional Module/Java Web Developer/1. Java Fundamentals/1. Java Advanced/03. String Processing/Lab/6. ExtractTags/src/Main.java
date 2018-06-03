/*
Read lines until you get the "END" command. Extract all tags from the given HTML using RegEx.
If there are no tags, don’t print anything.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();

        Pattern pattern = Pattern.compile("<.+?>");

        while (!inputLine.equals("END")) {
            Matcher matcher = pattern.matcher(inputLine);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
            inputLine = input.nextLine();
        }
    }
}
