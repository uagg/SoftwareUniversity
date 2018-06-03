/*
You are given a file named "input.txt". Read and print all of its contents as a sequence of bytes (the binary
representation of the ASCII code for each character) separated by a single comma.
Submit in Judge only the output of the program.
 */
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    private static FileInputStream fileStream = null;
    public static void main(String[] args) {
        String path = "D:\\input.txt";

        try {
            fileStream = new FileInputStream(path);
            int oneByte = fileStream.read();

            while (oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = fileStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}