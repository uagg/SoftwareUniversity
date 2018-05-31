/*
Да се напише програма, която въвежда скорост (десетично число) и отпечатва информация за скоростта.
При скорост до 10 (включително) отпечатайте “slow”. При скорост над 10 и до 50 отпечатайте “average”.
При скорост над 50 и до 150 отпечатайте “fast”. При скорост над 150 и до 1000 отпечатайте “ultra fast”.
При по-висока скорост отпечатайте “extremely fast”.
Подсказка: използвайте серия от if-else-if-else-… конструкции, за да хванете всичките 5 случая.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double speed = Double.parseDouble(scan.nextLine());
        if(speed <=10) {
            System.out.println("slow");
        }
        if((speed > 10) && (speed <= 50)) {
            System.out.println("average");
        }
        if((speed > 50) && (speed <=150)) {
            System.out.println("fast");
        }
        if((speed > 150) && (speed <= 1000)) {
            System.out.println("ultra fast");
        }
        if(speed > 1000) {
            System.out.println("extremely fast");
        }
    }
}