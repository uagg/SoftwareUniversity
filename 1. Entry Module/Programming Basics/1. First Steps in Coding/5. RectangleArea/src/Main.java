/*
Напишете Java програма, която прочита от конзолата две числа a и b,
пресмята и отпечатва лицето на правоъгълник със страни a и b.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double result = a * b;

        System.out.println(result);
    }
}