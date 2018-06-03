/*
Write a program that reads a text file and changes the casing of all letters to upper. Write the output to another file.
 */
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path inputPath = Paths.get("D:\\input.txt");
        String outputPath = "D:\\output.txt";

        try (BufferedReader in = Files.newBufferedReader(inputPath);
             PrintWriter out = new PrintWriter(new FileOutputStream(outputPath))) {

            String line = in.readLine();

            while (line != null) {
                out.write(line.toUpperCase());
                line = in.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
