/*
Write a program that extracts from a given text all palindromes, e.g. ABBA, lamal, exe and prints them separated by a
comma and a space. Use spaces, commas, dots, question marks and exclamation marks as word delimiters.
Print all unique palindromes, sorted lexicographically.
 */
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("[\\s,.?!]+");
        Set<String> palindromes = new TreeSet<>();

        for (String word : input) {

            if (isPalindrome(word)) {
                palindromes.add(word);
            }
        }

        if (palindromes.isEmpty()) {
            System.out.println("[]");
        } else {
            System.out.println("[" + String.join(", ", palindromes) + "]");
        }
    }

    private static boolean isPalindrome(String word) {

        if (word.equals("")) {
            return false;
        }

        String reversedWord = new StringBuilder(word).reverse().toString();

        return reversedWord.equals(word);
    }
}
