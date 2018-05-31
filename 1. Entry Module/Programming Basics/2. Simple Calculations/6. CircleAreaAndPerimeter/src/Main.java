/*
Напишете програма, която чете от конзолата число r и пресмята и отпечатва лицето и периметъра на кръг / окръжност с радиус r.
 */
import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius = Float.parseFloat(s.nextLine());
        double area = PI * radius * radius;
        double perimeter =  2 * PI * radius;
        System.out.printf("Area = %f\n", area);
        System.out.printf("Perimeter = %f", perimeter);
    }
}
