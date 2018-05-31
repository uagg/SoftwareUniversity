/*
Магазин за плодове през работните дни работи на следните цени:
плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
цена	2.50	1.20	0.85	1.45	2.70	5.50	3.85
Събота и неделя магазинът работи на по-високи цени:
плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
цена	2.70	1.25	0.90	1.60	3.00	5.60	4.20
Напишете програма, която чете от конзолата плод (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday) и количество (десетично число)
и пресмята цената според цените от таблиците по-горе. При невалиден ден от седмицата или невалидно име на плод да се
отпечата „error“.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine();
        double ammount = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        if(("Monday".equals(day)) || ("Tuesday".equals(day)) || ("Wednesday".equals(day)) || ("Thursday".equals(day)) || ("Friday".equals(day))) {
            if("banana".equals(fruit)) {
                price = 2.5 * ammount;
            } else if("apple".equals(fruit)) {
                price = 1.2 * ammount;
            } else if("orange".equals(fruit)) {
                price = 0.85 * ammount;
            } else if("grapefruit".equals(fruit)) {
                price = 1.45 * ammount;
            } else if("kiwi".equals(fruit)) {
                price = 2.7 * ammount;
            } else if("pineapple".equals(fruit)) {
                price = 5.5 * ammount;
            } else if("grapes".equals(fruit)) {
                price = 3.85 * ammount;
            } else {
                System.out.println("error");
            }
            System.out.printf("%.2f", price);
        } else if(("Saturday".equals(day)) || ("Sunday".equals(day))) {
            if("banana".equals(fruit)) {
                price = 2.7 * ammount;
            } else if("apple".equals(fruit)) {
                price = 1.25 * ammount;
            } else if("orange".equals(fruit)) {
                price = 0.9 * ammount;
            } else if("grapefruit".equals(fruit)) {
                price = 1.6 * ammount;
            } else if("kiwi".equals(fruit)) {
                price = 3.0 * ammount;
            } else if("pineapple".equals(fruit)) {
                price = 5.6 * ammount;
            } else if("grapes".equals(fruit)) {
                price = 4.2 * ammount;
            } else {
                System.out.println("error");
            }
            System.out.printf("%.2f", price);
        } else {
            System.out.println("error");
        }
    }
}