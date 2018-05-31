import java.util.Scanner;

public class Pr01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        double firstTime = Double.parseDouble(scanner.nextLine()) / 60.0d;
        double secondTime = Double.parseDouble(scanner.nextLine()) / 60.0d;
        double thirdTime = Double.parseDouble(scanner.nextLine()) / 60.0d;
        double dist1 = speed * firstTime;
        speed = speed * 1.10d;
        double dist2 = speed * secondTime;
        speed = speed * 0.95d;
        double dist3 = speed * thirdTime;
        System.out.printf("%.2f",(dist1 + dist2 + dist3));
    }
}
