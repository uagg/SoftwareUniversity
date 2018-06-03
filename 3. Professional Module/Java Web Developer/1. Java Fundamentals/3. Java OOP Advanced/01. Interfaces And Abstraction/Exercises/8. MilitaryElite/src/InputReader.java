import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {

    private static final String DELIMITER = "\\s+";

    private BufferedReader reader;

    public InputReader() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String[] readDataLine() {
        try {
            return this.reader.readLine().split(DELIMITER);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String[] readDataLine(String line) {
        return line.split(DELIMITER);
    }

    public String readLine() {
        try {
            return this.reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}