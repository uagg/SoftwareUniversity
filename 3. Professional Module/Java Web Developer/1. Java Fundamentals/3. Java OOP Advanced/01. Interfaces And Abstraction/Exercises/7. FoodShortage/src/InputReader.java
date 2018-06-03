import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class InputReader {

    private static final String DELIMITER = "\\s+";

    private BufferedReader reader;

    InputReader() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    String readLine() {
        try {
            return this.reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    String[] readEntryDataLine() {
        try {
            return this.reader.readLine().split(InputReader.DELIMITER);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}