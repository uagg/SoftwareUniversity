/*
Напишете програма, която чете градуси по скалата на Целзий (°C) и ги преобразува до градуси по скалата на Фаренхайт (°F).
Потърсете в Интернет подходяща формула, с която да извършите изчисленията.
Закръглете резултата до 2 знака след десетичната точка.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double celsius = Double.parseDouble(s.nextLine());
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.printf("%.2f", fahrenheit);
    }
}