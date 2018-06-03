/*
Write a program that reads a text file and prints on the console the sum of the ASCII symbols of all characters inside
of the file. Use BufferedReader in combination with FileReader.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\input.txt");

        try (BufferedReader reader = Files.newBufferedReader(path)) {

            String line = reader.readLine();
            long sum = 0;

            while (line != null) {

                for (char c : line.toCharArray()) {
                    sum += c;
                }

                line = reader.readLine();
            }

            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}