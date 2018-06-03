/*
Read the file named "input.txt" that is provided for this exercise and write all its content to a file while skipping
any punctuation. Skip the following symbols: ',', '.', '!', '?'.
Submit in Judge only the output of the program.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String inputPath = "D:\\input.txt";
        String outputPath = "D:\\output.txt";

        List<Character> forbiddenSymbols = new ArrayList<>();
        Collections.addAll(forbiddenSymbols, ',', '.', '!', '?');

        try (InputStream input = new FileInputStream(inputPath);
             OutputStream output = new FileOutputStream(outputPath)) {

            int oneByte = 0;

            while ((oneByte = input.read()) >= 0) {
                if (!forbiddenSymbols.contains((char) oneByte)) {
                    output.write(oneByte);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}