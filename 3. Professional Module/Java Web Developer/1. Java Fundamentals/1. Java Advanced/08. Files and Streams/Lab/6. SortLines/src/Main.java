/*
Read a text file and sort all lines. Write the result to another text file. Use Paths and Files classes.
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path input = Paths.get("D:\\input.txt");
        Path output = Paths.get("D:\\output.txt");

        try {
            List<String> lines = Files.readAllLines(input);
            Collections.sort(lines);
            Files.write(output, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
