/*
Напишете програма, която чете от конзолата три числа b1, b2 и h и пресмята лицето на трапец с основи b1 и b2
и височина h. Формулата за лице на трапец е (b1 + b2) * h / 2.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter b1: ");
        double b1 = Double.parseDouble(scan.nextLine());
        System.out.printf("Enter b2: ");
        double b2 = Double.parseDouble(scan.nextLine());
        System.out.printf("Enter h: ");
        double h = Double.parseDouble(scan.nextLine());
        double area = (b1 + b2) * h / 2;
        System.out.printf("The area of the trapezoid is %.2f", area);
    }
}
