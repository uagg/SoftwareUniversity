/*
Напишете програма, която чертае на конзолата правоъгълник от 10 x 10 звездички.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String text = repeatStr("*", 10);
            System.out.println(text);
        }
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}