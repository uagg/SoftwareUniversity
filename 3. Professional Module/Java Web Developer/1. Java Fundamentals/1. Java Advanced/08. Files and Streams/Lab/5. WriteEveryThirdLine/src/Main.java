/*
Read the file provided, named "input.txt" and write to another file all lines which number is divisible by 3.
Line numbers start from one.
Submit in Judge only the output of the program.
 */
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputPath = "D:\\input.txt";
        String outputPath = "D:\\output.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(inputPath));
             PrintWriter out = new PrintWriter(new FileWriter(outputPath))) {

            int counter = 1;
            String line = in.readLine();

            while (line != null) {
                if (counter % 3 == 0) {
                    out.println(line);
                }

                counter++;
                line = in.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}