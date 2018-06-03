import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine().trim();

        Lake<String> lake = new Lake<>(input.split("[,\\s]+"));

        List<String> output = new ArrayList<>();
        for (String n : lake) {
            output.add(String.valueOf(Long.parseLong(n)));
        }

        System.out.println(String.join(", ", output));
    }
}
