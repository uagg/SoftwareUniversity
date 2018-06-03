/*
Write a program that takes a string of banned words and a text. All words included in the ban list should be replaced
with "*", equal to the word's length. The entries in the ban list will be separated with a comma and a space ", ".
The ban list should be entered on the first input line and the text on the second input line.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] banList = sc.nextLine().split(", ");
        String text = sc.nextLine();

        for (int i = 0; i < banList.length; i++) {
            String currentForbiddenWord = banList[i];
            String censor = censoring(currentForbiddenWord);
            text = text.replace(currentForbiddenWord, censor);
        }

        System.out.println(text);
    }

    private static String censoring(String currentForbiddenWord) {
        return new String(new char[currentForbiddenWord.length()]).replace("\0", "*");
    }
}