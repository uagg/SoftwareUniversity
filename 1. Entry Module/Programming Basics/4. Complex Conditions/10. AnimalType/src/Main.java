/*
Напишете програма която принтира типа животно по името му:
•	dog -> mammal
•	crocodile, tortoise, snake -> reptile
•	others -> unknown
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
                System.out.println("reptile");
                break;
            case "tortoise":
                System.out.println("reptile");
                break;
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}