/*
Фирма дава следните комисионни на търговците си според града, в който работят и обема на продажбите s:
Град	0 ≤ s ≤ 500	500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000
Sofia	5%	7%	8%	12%
Varna	4.5%	7.5%	10%	13%
Plovdiv	5.5%	8%	12%	14.5%
Напишете конзолна програма, която чете име на град (стринг) и обем на продажби (десетично число) и изчислява и
извежда размера на търговската комисионна според горната таблица. Резултатът да се изведе закръглен с 2 цифри
след десетичната точка. При невалиден град или обем на продажбите (отрицателно число) да се отпечата „error“.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double ammount = Double.parseDouble(scanner.nextLine());
        double commision = -1.0;
        if(("Sofia".equals(town))) {
            if((ammount >= 0) && (ammount <=500)) {
                commision = ammount * 0.05;
            } else if((ammount > 500) && (ammount <= 1000)) {
                commision = ammount * 0.07;
            } else if((ammount > 1000) && (ammount <= 10000)) {
                commision = ammount * 0.08;
            } else if(ammount > 10000) {
                commision = ammount * 0.12;
            } else {
                System.out.println("error");
            }
        } else if(("Varna".equals(town))) {
            if ((ammount >= 0) && (ammount <= 500)) {
                commision = ammount * 0.045;
            } else if ((ammount > 500) && (ammount <= 1000)) {
                commision = ammount * 0.075;
            } else if ((ammount > 1000) && (ammount <= 10000)) {
                commision = ammount * 0.1;
            } else if (ammount > 10000) {
                commision = ammount * 0.13;
            } else {
                System.out.println("error");
            }
        } else if(("Plovdiv".equals(town))) {
            if((ammount >= 0) && (ammount <=500)) {
                commision = ammount * 0.055;
            } else if((ammount > 500) && (ammount <= 1000)) {
                commision = ammount * 0.08;
            } else if((ammount > 1000) && (ammount <= 10000)) {
                commision = ammount * 0.12;
            } else if(ammount > 10000) {
                commision = ammount * 0.145;
            }else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
        System.out.printf("%.2f", commision);
    }
}