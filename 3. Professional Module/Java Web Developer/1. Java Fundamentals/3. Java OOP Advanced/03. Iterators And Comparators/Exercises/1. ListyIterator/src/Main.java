import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CommandInterpreter ci = new CommandInterpreter();

        String input = sc.nextLine();

        while(! "END".equals(input)) {
            ci.readCommand(input);
            input = sc.nextLine();
        }

        sc.close();
    }
}