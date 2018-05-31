/*
Да се напише програма, която чете от конзолата число (не непременно цяло) и преобразува числото от инчове в сантиметри.
За целта умножава инчовете по 2.54 (защото 1 инч = 2.54 сантиметра).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = inches * 2.54;
        System.out.println(centimeters);
    }
}