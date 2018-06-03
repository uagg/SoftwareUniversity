import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class InputReader {

    private static final String DELIMITER = "\\s+";

    private BufferedReader reader;

    InputReader() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    String[] readCommandLine() throws IOException {
        return this.reader.readLine().split(DELIMITER);
    }

    String readLine() throws IOException {
        return this.reader.readLine();
    }
}