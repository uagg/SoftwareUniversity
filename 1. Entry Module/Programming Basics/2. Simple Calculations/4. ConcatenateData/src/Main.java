/*
Напишете Java програма, която прочита от конзолата име, фамилия, възраст и град и печата съобщение от следния вид:
“You are <firstName> <lastName>, a <age>-years old person from <town>”.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, city);
    }
}