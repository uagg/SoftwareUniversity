/*
Напишете програма, която чете ъгъл в радиани (rad) и го преобразува в градуси (deg). Потърсете в Интернет подходяща формула.
Числото π в Java програми е достъпно чрез Math.PI. Закръглете резултата до най-близкото цяло число.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radian = Double.parseDouble(scan.nextLine());
        long degrees = Math.round((radian * 180) / Math.PI);
        System.out.printf(String.valueOf(degrees));
    }
}