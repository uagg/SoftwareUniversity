import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Map<Integer, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) {
        String input = sc.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split(" ");
            commandChoicer(tokens);
            input = sc.nextLine();
        }
    }

    public static void commandChoicer(String[] inputTokens) {
        String command = inputTokens[0];
        int id = Integer.parseInt(inputTokens[1]);
        boolean permit = commandAuthorization(id);
        switch (command) {
            case "Create":
                if(permit) {
                    System.out.println("Account already exists");
                } else {
                    executeAccCreate(id);
                }
                break;
            case "Deposit":
                if(!permit) {
                    System.out.println("Account does not exist");
                } else {
                    double amount = Double.parseDouble(inputTokens[2]);
                    executeAccDeposit(id, amount);
                }
                break;
            case "Withdraw":
                if(!permit) {
                    System.out.println("Account does not exist");
                } else {
                    double amount = Double.parseDouble(inputTokens[2]);
                    executeAccWithdraw(id, amount);
                }
                break;
            case "Print":
                if(!permit) {
                    System.out.println("Account does not exist");
                } else {
                    executeAccPrint(id);
                }
                break;
        }
    }

    public static void executeAccCreate(int inputId) {
        BankAccount ba = new BankAccount();
        ba.setId(inputId);
        accounts.put(inputId, ba);
    }

    public static void executeAccDeposit(int inputId, double inputAmount) {
        BankAccount ba = accounts.get(inputId);
        ba.deposit(inputAmount);
    }

    public static void executeAccWithdraw(int inputId, double inputAmount) {
        BankAccount ba = accounts.get(inputId);
        try {
            ba.withdraw(inputAmount);
        } catch(IllegalStateException ise) {
            System.out.println(ise.getMessage());
        }
    }

    public static void executeAccPrint(int inputId) {
        BankAccount ba = accounts.get(inputId);
        System.out.println(ba.toString());
    }

    public static boolean commandAuthorization(int inputId) {
        boolean output = false;
        if (accounts.containsKey(inputId)) {
            output = true;
        }
        return output;
    }
}
