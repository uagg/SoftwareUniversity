import java.util.Scanner;

public class Pr05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String top1 = repeatString("*", n * 2 + 1);
        String top2 = repeatString(" ", (n * 2 + 1) - 4);
        String mid2 = repeatString(".", n);
        String bottom1 = repeatString("@", (n * 2 + 1) - 4);
        String bottom2 = repeatString("*", n * 2 + 1);
        System.out.printf("%s\n", top1);
        System.out.printf(".*%s*.\n",top2);
        int dotCount = 6;
        int dotCountForDots = (2 * n + 1) - 2;
        int dotCountForDots2 = n - 1;
        for (int i = 0; i < n - 2; i++) {
            String dots = repeatString(".", (n * 2 + 1) - dotCountForDots);
            String midMonkey = repeatString("@", (n * 2 + 1) - dotCount);
            dotCountForDots --;
            dotCount += 2;
            System.out.printf("%s*%s*%s\n", dots, midMonkey, dots);
        }
        System.out.printf("%s*%s\n", mid2, mid2);
        for (int i = 0; i < n - 2; i++) {
            String dots = repeatString(".", dotCountForDots2);
            String space = repeatString(" ", i);
            dotCountForDots2--;
            System.out.printf("%s*%s@%s*%s\n", dots, space, space, dots);
        }
        System.out.printf(".*%s*.\n",bottom1);
        System.out.printf("%s",bottom2);



    }

    static String repeatString(String value, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += value;
        }
        return result;
    }
}