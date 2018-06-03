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

    private static InputStream fileStream = null;
    private static OutputStream outStream = null;

    public static void main(String[] args) {
        String input = "D:\\input.txt";
        String output = "D:\\output.txt";

        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols, '.', ',', '!', '?');

        try {
            fileStream = new FileInputStream(input);
            outStream = new FileOutputStream(output);

            int oneByte = 0;

            while ((oneByte = fileStream.read()) >= 0) {
                if (!symbols.contains((char)oneByte)) {
                    outStream.write(oneByte);
                }
            }
        } catch (FileNotFoundException fne) {
            fne.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileStream != null) {
                try {
                    fileStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
