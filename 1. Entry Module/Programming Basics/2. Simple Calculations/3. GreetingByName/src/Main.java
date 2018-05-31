/*
Да се напише програма, която чете от конзолата име на човек и отпечатва “Hello, <name>!”, където <name> е въведеното
преди това име.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
