import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        CoffeeMachine machine = new CoffeeMachine();

        String input;
        while (!"END".equals(input = reader.nextLine())) {
            String[] cmdArgs = input.split(" ");

            if (cmdArgs.length == 1) {
                machine.insertCoin(cmdArgs[0]);
            } else {
                machine.buyCoffee(cmdArgs[0], cmdArgs[1]);
            }
        }

        for (Coffee coffee : machine.coffeesSold()) {
            System.out.println(coffee);
        }
    }
}