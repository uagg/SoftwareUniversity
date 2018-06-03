import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomList<String> customList = new CustomList<>();
        commandInterpreter ci = new commandInterpreter(customList);
        String input = reader.readLine();

        while(! "END".equals(input)) {
            ci.readCommand(input);
            input = reader.readLine();
        }
    }
}
