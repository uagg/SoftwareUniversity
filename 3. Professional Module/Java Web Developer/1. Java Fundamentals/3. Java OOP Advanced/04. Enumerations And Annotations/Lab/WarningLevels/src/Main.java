import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String loggerLevel = reader.readLine();

        Logger logger = new Logger(Importance.valueOf(
                loggerLevel.toUpperCase()));

        String cmd;
        while (! "END".equals(cmd = reader.readLine())) {
            String[] tokens = cmd.split(": ");
            String level = tokens[0];
            String content = tokens[1];

            Message message = new Message(Importance.valueOf(level.toUpperCase()), content);

            logger.record(message);
        }

        for (Message message : logger.getMessages()) {
            System.out.println(message);
        }
    }
}