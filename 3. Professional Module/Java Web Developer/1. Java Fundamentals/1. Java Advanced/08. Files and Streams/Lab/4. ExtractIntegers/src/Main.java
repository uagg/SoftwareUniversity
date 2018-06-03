/*
Read the file provided, named "input.txt" and extracts all integers that are not a part of a word in a separate file.
A valid integer is surrounded with white spaces.
Submit in Judge only the output of the program.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inPath = "D:\\input.txt";
        String outPath = "D:\\output.txt";
        try (Scanner reader = new Scanner(new FileInputStream(inPath));
             PrintWriter out = new PrintWriter(new FileOutputStream(outPath))) {

            while (reader.hasNext()) {
                if (reader.hasNextInt()) {
                    out.println(reader.nextInt());
                }

                reader.next();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
