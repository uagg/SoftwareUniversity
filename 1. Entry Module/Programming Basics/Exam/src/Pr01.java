import java.util.Scanner;

public class Pr01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double greenPaintLiters = 3.4;
        double redPaintLiters = 4.3;
        double doorDimensions = 1.2 * 2;
        double windowDimensions = 1.5 * 1.5;
        double backSide = x * x;
        double frontSide = x * x - (doorDimensions);
        double leftRightSide = y * x - (windowDimensions);
        double greenAreaSum = backSide + frontSide + leftRightSide + leftRightSide;
        double greenSumLiters = greenAreaSum / greenPaintLiters;

        double pokrivStrani = x * y;
        double pokrivTriangle = (x * h) / 2;
        double tavanec = pokrivStrani + pokrivStrani + pokrivTriangle + pokrivTriangle;
        double redSumLiters = tavanec / redPaintLiters;
        System.out.printf("%.2f\n",greenSumLiters);
        System.out.printf("%.2f",redSumLiters);

    }
}
