/*
You are given a text. Write a program that changes the text in all regions surrounded by the tags <upcase> and
</upcase> to upper-case. The tags won’t be nested.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();

        while (inputLine.contains("<upcase>")) {
            int indexOfStart = inputLine.indexOf("<upcase>");
            int indexOfEnd = inputLine.indexOf("</upcase>");

            String reminder = inputLine.substring(indexOfStart + 8, indexOfEnd);
            String upReminder = reminder.toUpperCase();
            inputLine = inputLine.replaceFirst(reminder, upReminder);
            inputLine = inputLine.replaceFirst("<upcase>", "");
            inputLine = inputLine.replaceFirst("</upcase>", "");
        }

        System.out.println(inputLine);
    }
}
