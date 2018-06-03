/*
Write a program that reads a list of words from the file words.txt and finds how many times each of the words is contained in another file text.txt. Matching should be case-insensitive.
Write the results in file results.txt. Sort the words by frequency in descending order.
 */
import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static HashMap<String, Long> WORDS_COUNT = new HashMap<>();

    public static void main(String[] args) {
        String inputFilePath = null;
        File inputFile = null;
        File outputFile = null;

        System.out.println("Enter path to file: ");

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            inputFilePath = console.readLine();
            inputFile = new File(inputFilePath);

            String inputFileName = inputFile.getName().substring(0, inputFile.getName().indexOf('.'));
            String newFileName = String.format("%s-RESULTS.txt", inputFileName);
            String outputFilePath = String.format("%s\\%s", inputFile.getParent(), newFileName);

            outputFile = new File(outputFilePath);

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 PrintWriter writer = new PrintWriter(outputFile)) {

                String line = reader.readLine();

                while (line != null) {
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        if (!WORDS_COUNT.containsKey(word))
                            WORDS_COUNT.put(word, 1L);
                        else {
                            Long totalCount = WORDS_COUNT.get(word) + 1;
                            WORDS_COUNT.put(word, totalCount);
                        }
                    }
                    line = reader.readLine();
                }

                WORDS_COUNT.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .forEach(entry -> {
                            writer.printf("%s - %s%n", entry.getKey(), entry.getValue());
                        });

                System.out.println("File created at: " + outputFilePath);
            } catch (Exception e) {
                System.out.println("[!] Very descriptive critical error message [!]");
            }

        } catch (Exception e) {
            System.out.println("[!] Very descriptive critical error message [!]");
        }
    }
}