/*
Първата задача от тази тема е следната: да се напише конзолна програма, която въвежда цяло число a и пресмята лицето
на квадрат със страна a. Задачата е тривиално лесна: въвеждате число от конзолата, умножавате го само по себе си и
печатате получения резултат на конзолата.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println(a * a);
    }
}
