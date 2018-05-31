/*
Да се напише програма, която въвежда парола (един ред с произволен текст) и проверява дали въведеното съвпада с фразата
“s3cr3t!P@ssw0rd”. При съвпадение да се изведе “Welcome”. При несъвпадение да се изведе “Wrong password!”.
Подсказка: използвайте if-else конструкцията.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String defaultPassword = "s3cr3t!P@ssw0rd";
        String setPass = scanner.nextLine();

        if(setPass.equals(defaultPassword)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}