/*
Write a program that reads the contents of two text files and merges them together into a third one.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("D:\\file3.txt");
        BufferedReader br = new BufferedReader(new FileReader("D:\\file1.txt"));

        String line = br.readLine();

        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }

        br = new BufferedReader(new FileReader("D:\\file2.txt"));

        line = br.readLine();

        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }

        pw.flush();
        br.close();
        pw.close();
    }
}