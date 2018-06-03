/*
Write a program that reads a text file and inserts line numbers in front of each of its lines. The result should be
written to another text file.
 */
import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\input.txt"));
             PrintWriter writer = new PrintWriter(new FileOutputStream("D:\\output.txt"))) {

            String line = reader.readLine();
            int lineCount = 1;

            while (line != null) {
                writer.printf("%s. %s%n", lineCount++, line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}