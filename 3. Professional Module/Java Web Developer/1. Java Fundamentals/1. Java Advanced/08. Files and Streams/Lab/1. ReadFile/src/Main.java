/*
You are given a file named "input.txt". Read and print all of its contents as a sequence of bytes (the binary
representation of the ASCII code for each character) separated by a single comma.
Submit in Judge only the output of the program.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\input.txt";

        try (InputStream input = new FileInputStream(path)) {
            int oneByte = input.read();

            while (oneByte >= 0) {
                String bit = Integer.toBinaryString(oneByte);
                System.out.print(bit + " ");
                oneByte = input.read();
            }

        } catch (FileNotFoundException fne) {
            fne.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}