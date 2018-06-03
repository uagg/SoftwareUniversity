/*
Write a program that reads some text from the console and counts the occurrences of each character in it. Print the
results in alphabetical (lexicographical) order.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] text = bf.readLine().toCharArray();
        Map<Character, Integer> charsCount = new TreeMap<>();

        for (char ch : text) {
            if (!charsCount.containsKey(ch)) {
                charsCount.put(ch, 0);
            }
            charsCount.put(ch, charsCount.get(ch) + 1);
        }

        for (Character character : charsCount.keySet()) {
            System.out.printf("%s: %d time/s%n", character, charsCount.get(character));
        }
    }
}