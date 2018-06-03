/*
Read the file named "input.txt" and write to another file every character's ASCII representation.
Write every space or new line as it is, e.g. as a space or a new line.
 */
import java.io.*;

public class Main {

    private static InputStream in = null;
    private static OutputStream out = null;

    public static void main(String[] args) {
        String input = "D:\\input.txt";
        String output = "D:\\output.txt";

        try {
            in = new FileInputStream(input);
            out = new FileOutputStream(output);

            int oneByte = in.read();

            while (oneByte >= 0) {

                if (oneByte == ' ' || oneByte == '\n') {
                    System.out.print(oneByte + " ");
                    out.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);

                    for (char ch : digits.toCharArray()) {
                        System.out.print(ch);
                        out.write(ch);
                    }
                }

                oneByte = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}