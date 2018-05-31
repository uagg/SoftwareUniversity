import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1 = Double.parseDouble(s.nextLine());
        double y1 = Double.parseDouble(s.nextLine());
        double x2 = Double.parseDouble(s.nextLine());
        double y2 = Double.parseDouble(s.nextLine());
        double sideX = Math.abs(x1 - x2);
        double sideY = Math.abs(y1 - y2);
        double area = sideX * sideY;
        double perimeter = 2 * (sideX + sideY);
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Area: %.2f", perimeter);
    }
}