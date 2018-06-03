/*
Read the file named "input.txt" and write to another file every character's ASCII representation.
Write every space or new line as it is, e.g. as a space or a new line.
 */
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputPath = "D:\\input.txt";
        String outputPath = "D:\\output.txt";

        try (InputStream input = new FileInputStream(inputPath);
             OutputStream output = new FileOutputStream(outputPath)) {

            int oneByte = 0;

            while ((oneByte = input.read()) >= 0) {
                if (oneByte == 10 || oneByte == 32) {
                    System.out.print(" ");
                    output.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);

                    for (char ch : digits.toCharArray()) {
                        System.out.print(ch);
                        output.write(ch);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}