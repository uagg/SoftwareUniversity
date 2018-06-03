/*
Write a program that reads a list of words from the file input.txt and finds the count of vowels, consonants and
punctuation marks. Assume that:
•	a, e, i, o, u are vowels
•	All others are consonants
•	Punctuation marks are (!,.?)
•	Do not count whitespace.
Write the results to another file.
 */
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path inputPath = Paths.get("D:\\input.txt");
        String ouputPath = "D:\\output.txt";

        List<Character> vowels = new ArrayList<>();
        List<Character> punctuation = new ArrayList<>();
        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u');
        Collections.addAll(punctuation, '!', ',', '.', '?');

        try (BufferedReader reader = Files.newBufferedReader(inputPath);
             PrintWriter out = new PrintWriter(new FileOutputStream(ouputPath))) {

            String line = reader.readLine();

            int vowelsCount = 0;
            int consonantsCount = 0;
            int punctuationCount = 0;

            while (line != null) {
                for (char c : line.toCharArray()) {
                    if (vowels.contains(c)) {
                        vowelsCount++;
                    } else if (punctuation.contains(c)) {
                        punctuationCount++;
                    } else if (!vowels.contains(c) && !punctuation.contains(c) && c != 32) {
                        consonantsCount++;
                    }
                }

                line = reader.readLine();
            }
            out.write("Vowels: " + vowelsCount + "\r\n");
            out.write("Consonants: " + consonantsCount + "\r\n");
            out.write("Punctuation: " + punctuationCount);

            System.out.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d", vowelsCount, consonantsCount, punctuationCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}