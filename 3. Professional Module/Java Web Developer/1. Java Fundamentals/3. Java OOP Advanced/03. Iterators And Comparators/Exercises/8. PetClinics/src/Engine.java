import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine implements Runnable {

    private final CommandInterpreter commandInterpreter;

    private final BufferedReader reader;

    public Engine() {
        this.commandInterpreter = new CommandInterpreter();
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() {

        String input;
        int commandsCount = 0;

        try {
            commandsCount = Integer.parseInt(reader.readLine());
        } catch (IOException ignored) {
            return;
        }

        while (commandsCount-- > 0) {

            try {
                input = reader.readLine();
            } catch (IOException ignored) {
                return;
            }

            this.commandInterpreter.readCommand(input);
        }
    }
}