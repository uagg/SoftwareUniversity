import java.util.Scanner;

public class Pr02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cash = Double.parseDouble(scanner.nextLine());
        double floorWidth = Double.parseDouble(scanner.nextLine());
        double floorLength = Double.parseDouble(scanner.nextLine());
        double triangleSide = Double.parseDouble(scanner.nextLine());
        double triangleH = Double.parseDouble(scanner.nextLine());
        double pricePerTile = Double.parseDouble(scanner.nextLine());
        double handyManFee = Double.parseDouble(scanner.nextLine());

        double floorArea = floorLength * floorWidth;
        double triangleArea = triangleSide * triangleH / 2;
        double requiredTiles = Math.ceil(floorArea / triangleArea + 5);
        double sum = requiredTiles * pricePerTile + handyManFee;

        double check1 = Math.abs(sum - cash);
        double check2 = Math.abs(cash - sum);

        if(sum > cash) {
            System.out.printf("You'll need %.2f lv more.", check1);
        } else {
            System.out.printf("%.2f lv left.", check2);
        }

    }
}
