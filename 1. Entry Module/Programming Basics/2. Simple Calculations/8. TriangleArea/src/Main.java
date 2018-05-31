/*
Напишете програма, която чете от конзолата страна и височина на триъгълник и пресмята неговото лице.
Използвайте формулата за лице на триъгълник: area = a * h / 2. Закръглете резултата до 2 знака след десетичната точка
използвайки “%.2f“.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = Double.parseDouble(s.nextLine());
        double h = Double.parseDouble(s.nextLine());
        double area = (x * h) / 2;
        System.out.printf("Triangle area = %.2f", area);
    }
}