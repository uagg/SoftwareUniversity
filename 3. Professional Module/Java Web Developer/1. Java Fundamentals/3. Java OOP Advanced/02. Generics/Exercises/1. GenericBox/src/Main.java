import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(reader.readLine());

        for (int i = 0; i < tests; i++) {
            String input = reader.readLine();
            Box<String> box = new Box<>(input);
            System.out.println(box.toString());
        }
    }
}
