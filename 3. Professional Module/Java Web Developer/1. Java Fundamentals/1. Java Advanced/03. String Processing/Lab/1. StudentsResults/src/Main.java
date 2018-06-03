/*
Write a program that reads one line, containing a student’s name and his results in format
{name} - {firstResult}, {secondResult}, {thirdResult}
Print a table on the console. Each row must contain:
•	JAdv - first result, aligned right, rounded to a precision of 2
•	OOP - second result, aligned right, rounded to a precision of 2
•	AdvOOP - third result, aligned right, rounded to a precision of 2
•	Average – average result, rounded to a precision of 4
•	Columns have a width of 7 characters and must be separated with "|"
•	Don't forget the heading row
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] tokens = input.nextLine().split("-|,");

        String name = tokens[0];
        double jAdv = Double.parseDouble(tokens[1]);
        double OOP = Double.parseDouble(tokens[2]);
        double AdvOOP = Double.parseDouble(tokens[3]);
        double avg = (jAdv + OOP + AdvOOP) / 3;

        System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|", "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"));
        System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|", name, jAdv, OOP, AdvOOP, avg));
    }
}
