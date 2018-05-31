/*
Принтирайте името на деня на седмицата по номер на деня от (на английаки) [1...7] или принтирайте “Error” за невалидно число.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        if((day <= 7) && (day >=1)) {
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        } else {
            System.out.println("Error");
        }
    }
}