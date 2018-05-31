/*
В една кинозала столовете са наредени в правоъгълна форма в r реда и c колони. Има три вида прожекции с билети на
 различни цени:
•	Premiere – премиерна прожекция, на цена 12.00 лева.
•	Normal – стандартна прожекция, на цена 7.50 лева.
•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
Напишете програма, която въвежда тип прожекция (стринг), брой редове и брой колони в залата (цели числа) и изчислява
общите приходи от билети при пълна зала. Резултатът да се отпечата във формат като в примерите по-долу, с 2 знака след
десетичната точка.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int area = r * c;
        double price = 0;
        double premierePrice = 12.00;
        double normalPrice = 7.50;
        double discountPrice = 5.00;
        switch (type) {
            case "Premiere":
                price = area * premierePrice;
                break;
            case "Normal":
                price = area * normalPrice;
                break;
            case "Discount":
                price = area * discountPrice;
                break;
            default:
                System.out.println("Error");
                break;
        }
        System.out.printf("%.2f leva", price);
    }
}