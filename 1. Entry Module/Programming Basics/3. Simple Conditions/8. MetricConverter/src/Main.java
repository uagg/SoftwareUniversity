/*
Да се напише програма, която преобразува разстояние между следните 8 мерни единици: m, mm, cm, mi, in, km, ft, yd.
Използвайте съответствията от таблицата по-долу:
1 meter (m)	1000 millimeters (mm)
1 meter (m)	100 centimeters (cm)
1 meter (m)	0.000621371192 miles (mi)
1 meter (m)	39.3700787 inches (in)
1 meter (m)	0.001 kilometers (km)
1 meter (m)	3.2808399 feet (ft)
1 meter (m)	1.0936133 yards (yd)
Входните данни се състоят от три реда:
•	Първи ред: число за преобразуване
•	Втори ред: входна мерна единица
•	Трети ред: изходна мерна единица (за резултата)

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double m = 1;
        double mm = 1000.0;
        double cm = 100.0;
        double mi = 0.000621371192;
        double inch = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        double firstConvert = 0;
        double secondConvert = 0;
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();

        switch (inputUnit) {
            case "m":
                firstConvert = number / m;
                break;
            case "mm":
                firstConvert = number / mm;
                break;
            case "cm":
                firstConvert = number / cm;
                break;
            case "mi":
                firstConvert = number / mi;
                break;
            case "in":
                firstConvert = number / inch;
                break;
            case "km":
                firstConvert = number / km;
                break;
            case "ft":
                firstConvert = number / ft;
                break;
            case "yd":
                firstConvert = number / yd;
                break;
        }
        switch (outputUnit) {
            case "m":
                secondConvert = firstConvert * m;
                break;
            case "mm":
                secondConvert = firstConvert * mm;
                break;
            case "cm":
                secondConvert = firstConvert * cm;
                break;
            case "mi":
                secondConvert = firstConvert * mi;
                break;
            case "in":
                secondConvert = firstConvert * inch;
                break;
            case "km":
                secondConvert = firstConvert * km;
                break;
            case "ft":
                secondConvert = firstConvert * ft;
                break;
            case "yd":
                secondConvert = firstConvert * yd;
                break;
        }
        System.out.println(secondConvert);
    }
}