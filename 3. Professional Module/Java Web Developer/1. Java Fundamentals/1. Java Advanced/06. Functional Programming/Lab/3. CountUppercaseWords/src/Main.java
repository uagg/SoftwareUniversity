/*
Write a program that reads one line of text from the console. Print the count of words that start with a Uppercase
letter, after that print all these words in the same order, like you found them in the text.
Use a Predicate<String>
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] textArray = sc.nextLine().split(" ");

        Predicate<String> checkerUpperCase = s -> s.charAt(0) == s.toUpperCase().charAt(0);

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < textArray.length; i++) {
            if (checkerUpperCase.test(textArray[i])) {
                result.add(textArray[i]);
            }
        }

        System.out.println(result.size());
        for (String word : result) {
            System.out.println(word);
        }
    }
}